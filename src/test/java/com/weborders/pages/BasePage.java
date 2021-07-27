package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    @FindBy(css = "h1")
    private WebElement pageLogo;
    @FindBy(css = "h2")
    private WebElement subTitle;
    @FindBy(xpath = "//a[.='View all orders']")
    private WebElement viewAllOrders;
    @FindBy(xpath = "//a[.='View all products']")
    private WebElement viewAllProducts;
    @FindBy(xpath = "//a[.='Order']")
    private WebElement order;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logout;

    public BasePage(){
       PageFactory.initElements(driver, this);
   }

}
