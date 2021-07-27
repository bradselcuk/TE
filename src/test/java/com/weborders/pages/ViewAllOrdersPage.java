package com.weborders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllOrdersPage extends BasePage{

    @FindBy(xpath = "//a[.='Check All']")
    public WebElement checkAll;
    @FindBy(xpath = "//a[.='Uncheck All']")
    public WebElement uncheckAll;
    @FindBy(xpath = "//tr[2]/td[1]/input[1]")
    public WebElement firstPerson;
    @FindBy(xpath = "//input[@class='btnDeleteSelected']")
    public WebElement deleteButton;
    @FindBy(xpath = "//tr[2]/td[13]/input[1]")
    public WebElement editOrder;
    @FindBy(xpath="//input[@class='btn_dark']")
    public WebElement calculate;
    @FindBy (css = ".btn_light")
    public WebElement update;
}
