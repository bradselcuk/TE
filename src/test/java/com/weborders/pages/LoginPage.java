package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

//  ** Finding Elements ****************************
    @FindBy(xpath = "//div[@class='login']/input[1]")
    private WebElement username;
    @FindBy(xpath = "//div[@class='login']/input[2]")
    private WebElement password;

//  ************************************************

    public void login() { // LOGIN METHOD
        BrowserUtilities.wait(2);
        String userNameValue = ConfigurationReader.getProperty("U");
        String userPasswordValue = ConfigurationReader.getProperty("P");
        username.sendKeys(userNameValue);
        password.sendKeys(userPasswordValue, Keys.ENTER);

    }
}
