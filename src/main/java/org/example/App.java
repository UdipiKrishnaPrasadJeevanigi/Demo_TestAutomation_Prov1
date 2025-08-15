package org.example;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App 
{
    public int userLogin(String in_username, String in_password) {
        // Simulate a user login process
        ResourceBundle rb = ResourceBundle.getBundle("config");
        String expectedUsername = rb.getString("username"); // expectedUsername = "udipikrishna"
        String expectedPassword = rb.getString("password"); // expectedPassword = "udipi@200136"
        if (expectedUsername.equals(in_username) && expectedPassword.equals(in_password)) {
            return 1; // Return user ID for successful login
        } else {
            return 0; // Return 0 for failed login
        }
    }
}
