package co.com.qvision.test.stepdefinitions;

import co.com.prueba.qvision.questions.*;
import co.com.prueba.qvision.tasks.*;
import co.com.prueba.qvision.userinterface.UrlQVision;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class PruebaQVisionStepDefinitions {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^luis se registra en la pagina con sus datos basicos nombre \"([^\"]*)\" apellido \"([^\"]*)\" y telefono \"([^\"]*)\" y su email \"([^\"]*)\"$")
    public void luisSeRegistraEnLaPaginaConSusDatosBasicosNombreApellidoYTelefonoYSuEmail(String nombre, String apellido, String telefono, String email) {
        theActorCalled("Luis").attemptsTo(OpenUrlQVision.openUrl(UrlQVision.UrlIndex), RegistroUsuario.registroUsuario(nombre, apellido, telefono, email));
    }

    @When("^realiza una compra exitosamente$")
    public void realizaUnaCompraExitosamente() {
        
    }

    @Then("^debe de generar un comprobante de compra$")
    public void debeDeGenerarUnComprobanteDeCompra() {
    }

}

