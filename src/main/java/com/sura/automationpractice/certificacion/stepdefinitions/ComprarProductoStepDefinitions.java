package com.sura.automationpractice.certificacion.stepdefinitions;

import com.sura.automationpractice.certificacion.pageobject.LoginPageObject;
import com.sura.automationpractice.certificacion.steps.CompraProductoSteps;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class ComprarProductoStepDefinitions {

    @Steps
    private CompraProductoSteps comprarProducto;


    @Given("^el usuario ingresa a la pagina donde se loguea con un usuario registrado$")
    public void elUsuarioIngresaALaPaginaDondeSeLogueaConUnUsuarioRegistrado(List<Map<String,String>> usuario) {
        comprarProducto.ingresarLogin();
        comprarProducto.realizarLogin(usuario.get(0).get("usuario"), usuario.get(0).get("contrasena"));
    }

    @When("el usuario agrega al carro un procducto realizando toda la pasarela de pago")
    public void elUsuarioAgregaAlCarroUnProcductoRealizandoTodaLaPasarelaDePago() {
        comprarProducto.seleccionarProducto();
        comprarProducto.pasarelaPago();
    }

    @Then("el usuario ve mensaje de pago exitoso")
    public void elUsuarioVeMensajeDePagoExitoso() {
        comprarProducto.verificarMensajeExito();
    }
}
