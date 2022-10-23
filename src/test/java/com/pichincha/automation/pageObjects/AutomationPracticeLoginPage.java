package com.pichincha.automation.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationPracticeLoginPage extends PageObject {
    By email = By.id("email");
    By password = By.id("passwd");
    By signinButton = By.id("SubmitLogin");

    public  WebElement getEmail(){
        return getDriver().findElement(email);
    }

    public  WebElement getPassword(){
        return getDriver().findElement(password);
    }

    public  WebElement getSigninButton(){
        return getDriver().findElement(signinButton);
    }
}
