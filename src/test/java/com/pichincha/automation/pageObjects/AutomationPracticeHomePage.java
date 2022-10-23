package com.pichincha.automation.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationPracticeHomePage extends PageObject {

    By logo = By.className("logo");
    By loginButton = By.className("login");
    By accountName = By.className("account");

    By womenCat = By.xpath("//a[@title='Women']");

    By goToCart = By.xpath("//a[@title='View my shopping cart']");


    public WebElement getLogo() {
        return getDriver().findElement(logo);
    }

    public WebElement getLoginButton(){
        return getDriver().findElement(loginButton);
    }

    public WebElement getAccountName() {
        return getDriver().findElement(accountName);
    }

    public WebElement getWomenCat(){
        return getDriver().findElement(womenCat);
    }

    public WebElement getGoToCart(){
        return  getDriver().findElement(goToCart);
    }

}
