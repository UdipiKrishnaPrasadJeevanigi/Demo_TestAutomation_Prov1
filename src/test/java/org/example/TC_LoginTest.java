package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_LoginTest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
    }

    @Test
    public void testAppLogin() {
        // Test the App class login functionality
        App app = new App();
        int result = app.userLogin("udipikrishna", "udipi@200136");
        Assert.assertEquals(result, 1, "Login should be successful with correct credentials");
    }

    @Test
    public void testBrowserNavigation() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"), "Should be able to navigate to Google");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
