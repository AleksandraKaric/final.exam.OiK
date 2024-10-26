package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.LoginPage;
import page.SecureAreaPage;

public class LoginTest extends BaseTest {

        LoginPage loginPage;
        SecureAreaPage secureAreaPage;

        @Before
        public void SetUpTest1(){

        loginPage = new LoginPage();
        secureAreaPage = new SecureAreaPage();

        }

        // Positive Test Cases

        // Verify the user can log in successfully with valid data
        @Test
        public void successfulLogin (){
            loginPage.usernameInputFieldSendKeys("tomsmith");
            loginPage.passwordInputFieldSendKeys("SuperSecretPassword!");
            loginPage.loginButtonClick();
            Assert.assertTrue(secureAreaPage.succesfullLoginMessageIsDisplayed());
            Assert.assertEquals("You logged into a secure area!\n×", secureAreaPage.successfulLoginMessageGetText());
        }

        // Negative Test Cases

        /* Verify the user can't log in just clicking the Login button
        NOTE: In this situation better solution is to put require field messages next to text forms
         */
        @Test
        public void loginLeavingTheMandatoryFieldsEmpty(){
            loginPage.loginButtonClick();
            Assert.assertTrue(loginPage.usernameInvalidFlashMessageIsDisplayed());
            Assert.assertEquals("Your username is invalid!\n×", loginPage.usernameInvalidFlashMessageGetText());
        }

        // Verify the user can't login with invalid username
}
