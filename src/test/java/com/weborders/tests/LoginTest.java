package com.weborders.tests;

import com.weborders.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        extentTest= extentReports.createTest("Login Test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        extentTest.pass("Login Test has Completed Successfully");
    }
}
