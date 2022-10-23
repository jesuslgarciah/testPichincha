package com.pichincha.automation.steps;

import com.pichincha.automation.pageObjects.AutomationPracticeCartSummaryPage;
import com.pichincha.automation.pageObjects.AutomationPracticeHomePage;
import com.pichincha.automation.pageObjects.AutomationPracticeLoginPage;
import com.pichincha.automation.pageObjects.AutomationPracticeWomenPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class AutomationPracticeSteps {
    AutomationPracticeHomePage homePage = new AutomationPracticeHomePage();
    AutomationPracticeLoginPage loginPage = new AutomationPracticeLoginPage();
    AutomationPracticeWomenPage womenPage = new AutomationPracticeWomenPage();
    AutomationPracticeCartSummaryPage cartSummaryPage = new AutomationPracticeCartSummaryPage();

    @Step
    public void openWeb(){
        homePage.open();
        Assert.assertTrue(homePage.getLogo().isDisplayed());
    }

    @Step
    public void seleccionarLogin(){
        homePage.getLoginButton().click();
    }

    @Step
    public void diligenciarCorreo (String correo){
        loginPage.getEmail().sendKeys(correo);
    }

    @Step
    public void diligenciarContrasenia (String contrasenia){
       loginPage.getPassword().sendKeys(contrasenia);
    }

    @Step
    public void validarLogin(){
        loginPage.getSigninButton().click();
        Assert.assertTrue(homePage.getAccountName().isDisplayed());
    }

    @Step
    public void seleccionarCategoriaMujeres(){
        homePage.getWomenCat().click();
    }

    @Step
    public void agregarProductosAlCarrito(int cantidad){
        for (int i = 0; i < cantidad; i++){
            womenPage.getAddToCartElements().get(i).click();
            womenPage.getContinueShopping().click();
        }
    }

    @Step
    public void irAlCarrito(){
        homePage.getGoToCart().click();
    }

    @Step
    public void irAlPago(){
        cartSummaryPage.getProceedToCheckoutButton().click();
    }

    @Step
    public void aceptarTerminos(){
        cartSummaryPage.getAcceptTerms().click();
    }

    @Step
    public void pagoTransferenciaBancaria(){
        cartSummaryPage.getPayByBankWire().click();
    }

    @Step
    public void confirmarOrden(){
        cartSummaryPage.getProceedToCheckoutButton().click();
        JavascriptExecutor js = (JavascriptExecutor) cartSummaryPage.getDriver();
        js.executeScript("arguments[0].style.border='3px solid red'", cartSummaryPage.getLabelComplete());
        Assert.assertTrue(cartSummaryPage.getLabelComplete().getText().contains("complete"));
    }
}
