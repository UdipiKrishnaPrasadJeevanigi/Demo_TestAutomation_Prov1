#   Maven Project
-   This is a Maven project that uses the `maven-compiler-plugin` to compile
-   Maven cycle contains the following phases:
    -   `validate`: Validate the project is correct and all necessary information is available.
    -   `compile`: Compile the source code of the project.
    -   `test`: Test the compiled source code using a suitable unit testing framework.
    -   `package`: Package the compiled code in its distributable format, such as a JAR.
    -   `verify`: Run any checks to verify the package is valid and meets quality criteria.
    -   `install`: Install the package into the local repository, for use as a dependency in other projects locally.
    -   `deploy`: Copy the final package to the remote repository for sharing with other developers and projects.
    
# POM File Requirements

-   The POM File contains dependencies and plugins required.
- **Plugins** are used to manage the build process.
-   The `maven-compiler-plugin` is used to compile the Java source code.
-   The `maven-surefire-plugin` is used to run unit tests.
- **Dependencies** are libraries that the project needs to compile and run.
-  The `junit` dependency is used for unit testing.
-  The testng dependency is used for integration testing.
-  The selenium-java dependency is used for browser automation testing.
-  The `log4j` dependency is used for logging.


# Jenkins Integration
- Groovy code
`  pipeline {
  agent any
  tools {
  maven  "maven-3.9"
  }
  stages {
  stage("Clean Up"){
  steps {
  deleteDir()
  }
  }
  stage("Clone Repo"){
  steps {
  sh "git clone https://github.com/jenkins-docs/simple-java-maven-app.git"
  }
  }
  stage("Build"){
  steps {
  dir("simple-java-maven-app") {
  sh "mvn clean install"
  }
  }
  }
  stage("Test"){
  steps {
  dir("simple-java-maven-app") {
  sh "mvn test"
  }
  }
  }
  }
  }'`