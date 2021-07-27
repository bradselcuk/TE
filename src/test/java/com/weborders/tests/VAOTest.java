package com.weborders.tests;

import com.weborders.pages.BasePage;
import com.weborders.pages.LoginPage;
import com.weborders.pages.ViewAllOrdersPage;
import com.weborders.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VAOTest extends BaseTest {

    @Test
    public void vao1() {
        extentTest = extentReports.createTest("View All Orders Page Test-1");
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        BrowserUtilities.wait(2);
        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
        viewAllOrdersPage.checkAll.click();
        viewAllOrdersPage.uncheckAll.click();
        viewAllOrdersPage.checkAll.click();
        viewAllOrdersPage.deleteButton.click();
        viewAllOrdersPage.logout.click();
        extentTest.pass("CheckAll, UncheckAll, Delete and Logout buttons works");
    }

    @Test
    public void vao2() {
        extentTest = extentReports.createTest("View All Orders Page Test-2");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtilities.wait(2);

        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
        viewAllOrdersPage.firstPerson.click();
        viewAllOrdersPage.deleteButton.click();
        extentTest.pass("First Person has been deleted");
    }

    @Test
    public void vao3() {
        extentTest = extentReports.createTest("View All Orders Page Test-3");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtilities.wait(2);
//      ************EditOrder**************************
        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
        viewAllOrdersPage.editOrder.click();
        BrowserUtilities.wait(2);
//      *************Product Information***************
        WebElement product = driver.findElement(By.cssSelector("select"));
        Select s1 = new Select(product);
        s1.selectByVisibleText("FamilyAlbum");
        BrowserUtilities.wait(1);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='2']"));
        BrowserUtilities.wait(2);
        quantity.clear();
        BrowserUtilities.wait(2);
        quantity.sendKeys("5");
        BrowserUtilities.wait(2);
        viewAllOrdersPage.calculate.click();
//      *************Address Information***************
        WebElement customerName = driver.findElement(By.xpath("//input[@value='Paul Brown']"));
        customerName.clear();
        customerName.sendKeys("Brad Selcuk");
        WebElement street = driver.findElement(By.xpath("//input[@value='5, Ringer Street']"));
        street.clear();
        street.sendKeys("1923 Louetta Point");
        WebElement city = driver.findElement(By.xpath("//input[@value='Las Vegas, NV']"));
        city.clear();
        city.sendKeys("Spring, TX");
        WebElement zip = driver.findElement(By.xpath("//input[@value='748']"));
        zip.clear();
        zip.sendKeys("77388");
//      *************Payment Information***************
        WebElement card = driver.findElement(By.xpath("//input[@value='American Express']"));
        card.click();
        WebElement cardNr = driver.findElement(By.xpath("//input[@value='123456789012']"));
        cardNr.clear();
        cardNr.sendKeys("278694632901");
        WebElement expire = driver.findElement(By.xpath("//input[@value='02/07']"));
        expire.clear();
        expire.sendKeys("03/22");
        viewAllOrdersPage.update.click();
        BrowserUtilities.wait(2);
        extentTest.pass("First Record has been edited");
    }

}