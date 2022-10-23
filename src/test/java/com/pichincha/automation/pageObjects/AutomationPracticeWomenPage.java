package com.pichincha.automation.pageObjects;

import io.cucumber.java.en_lol.WEN;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AutomationPracticeWomenPage extends PageObject {
    By addToCartElements = By.xpath("//a[@title='Add to cart']");
    By continueShoppingLocator = By.className("continue");

    public List<WebElement> getAddToCartElements(){
        return getDriver().findElements(addToCartElements);
    }

    public WebElement getContinueShopping(){
        //WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(continueShoppingLocator));
        return getDriver().findElement(continueShoppingLocator);
    }
}
