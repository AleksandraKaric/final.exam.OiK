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
        @Test
        public void successfulLogin (){
            loginPage.usernameInputFieldSendKeys("tomsmith");
            loginPage.passwordInputFieldSendKeys("SuperSecretPassword!");
            loginPage.loginButtonClick();
            Assert.assertTrue(secureAreaPage.succesfullLoginMessageIsDisplayed());
            Assert.assertEquals("You logged into a secure area!", secureAreaPage.successfulLoginMessageGetText());
        }

}
