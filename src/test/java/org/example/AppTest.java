package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
   @Test
    public void testUserLogin() {
         App app = new App();
         int result = app.userLogin("udipikrishna", "udipi@200136");
         Assert.assertEquals(result, 1, "Expected user ID to be 1 for successful login");
    }

    @Test
    public void testUserLoginFailure() {
        App app = new App();
        int result = app.userLogin("udipi", "krishna2k1");
        assert result == 0 : "Expected user ID to be 0 for failed login";
    }
}
