package co.com.qvision.test.stepdefinitions;

import co.com.prueba.qvision.questions.*;
import co.com.prueba.qvision.tasks.*;
import co.com.prueba.qvision.userinterface.UrlQVision;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class PruebaQVisionStepDefinitions {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^luis se registra en la pagina con sus datos basicos$")
    public void luisSeRegistraEnLaPaginaConSusDatosBasicos(Map<String, String> dataRegistro) {
        theActorCalled("Luis").attemptsTo(OpenUrlQVision.openUrl(UrlQVision.UrlIndex), RegistroUsuario.registroUsuario(dataRegistro));
    }
    @When("^realiza una compra exitosamente$")
    public void realizaUnaCompraExitosamente() {
       theActorInTheSpotlight().attemptsTo(ComprarVestido.Buy());
    }
    @And("^descarga el recibo de compra$")
    public void descargaElReciboDeCompra() {
        theActorInTheSpotlight().attemptsTo(Profile.profile());
    }
    @And("^envia el comprobante de pago$")
    public void enviaElComprobanteDePago(Map <String,String> datosMail) {
        theActorInTheSpotlight().attemptsTo(OpenUrlQVision.openUrl(UrlQVision.UrlGmail), EnviarCorreo.envioCorreo(datosMail));
    }
    @Then("^el correo debio ser enviado$")
    public void elCorreoDebioSerEnviado() {
        theActorInTheSpotlight().should(seeThat(Comprobante.comprobante(), is(true)));
    }
}

