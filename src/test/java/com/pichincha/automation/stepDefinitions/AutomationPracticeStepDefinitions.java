package com.pichincha.automation.stepDefinitions;

import com.pichincha.automation.steps.AutomationPracticeSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AutomationPracticeStepDefinitions {

    @Steps
    AutomationPracticeSteps automationPracticeSteps = new AutomationPracticeSteps();

    @Given("quiero iniciar sesion en la tienda")
    public void quieroIniciarSesionEnLaTienda(){
        automationPracticeSteps.openWeb();
        automationPracticeSteps.seleccionarLogin();
        automationPracticeSteps.diligenciarCorreo("jejejeje@jkjkhkj.com");
        automationPracticeSteps.diligenciarContrasenia("12345");
        automationPracticeSteps.validarLogin();
    }

    @And("quiero realizar una compra de dos articulos")
    public void quieroRealizarUnaCompraDeDosArticulos(){
        automationPracticeSteps.seleccionarCategoriaMujeres();
    }

    @When("^agregue los (.*) articulos al carrito$")
    public void agregueLosArticulosAlCarrito(int cantArticulos) {
        automationPracticeSteps.agregarProductosAlCarrito(cantArticulos);
    }

    @Then("podre realizar el proceso de compra")
    public void podreRealizarElProcesoDeCompra(){
        automationPracticeSteps.irAlCarrito();
        automationPracticeSteps.irAlPago();
        automationPracticeSteps.irAlPago();
        automationPracticeSteps.aceptarTerminos();
        automationPracticeSteps.irAlPago();
        automationPracticeSteps.pagoTransferenciaBancaria();
        automationPracticeSteps.confirmarOrden();
    }
}
