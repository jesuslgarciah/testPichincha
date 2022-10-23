package com.pichincha.automation.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationPracticeCartSummaryPage extends PageObject {
    By proceedToCheckoutButton = By.cssSelector(".cart_navigation .button");
    By acceptTerms = By.id("cgv");
    By payByBankWire = By.className("bankwire");

    By labelComplete = By.cssSelector(".cheque-indent .dark");

    public WebElement getProceedToCheckoutButton(){
        return getDriver().findElement(proceedToCheckoutButton);
    }

    public WebElement getAcceptTerms(){
        return getDriver().findElement(acceptTerms);
    }

    public WebElement getPayByBankWire(){
        return getDriver().findElement(payByBankWire);
    }

    public WebElement getLabelComplete(){
        return getDriver().findElement(labelComplete);
    }
}
