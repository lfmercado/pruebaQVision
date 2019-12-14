package co.com.prueba.qvision.tasks;

import co.com.prueba.qvision.userinterface.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import java.util.Map;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistroUsuario implements Task {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String contraseña;
    private String ciudad;
    private String compañia;
    private String codigoPostal;
    private String direccion;


    RegistroUsuario(Map<String, String> dataRegistro){
        this.nombre = dataRegistro.get("nombre");
        this.apellido = dataRegistro.get("apellido");
        this.telefono = dataRegistro.get("telefono");
        this.email = crearEmailUnico(dataRegistro.get("email"));
        this.contraseña = dataRegistro.get("contraseña");
        this.codigoPostal = dataRegistro.get("codigoPost");
        this.compañia = dataRegistro.get("compañia");
        this.ciudad = dataRegistro.get("ciudad");
        this.direccion = dataRegistro.get("direccion");

    }

    public String crearEmailUnico(String datos){

        String prefijo = datos.split("@")[0]+ System.currentTimeMillis();
        return prefijo+"@"+datos.split("@")[1];

    }
    @Override
    @Step("{1} un usuario se registra ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroUsuarioPage.SIGN_IN),
                Enter.theValue(email).into(RegistroUsuarioPage.EMAIL),
                Click.on(RegistroUsuarioPage.CREATE_ACCOUNT),
                WaitUntil.the(RegistroUsuarioPage.RADIO_BUTTON_MR, isVisible()),
                Click.on(RegistroUsuarioPage.RADIO_BUTTON_MR),
                Enter.theValue(nombre).into(RegistroUsuarioPage.FIRST_NAME1),
                Enter.theValue(apellido).into(RegistroUsuarioPage.LAST_NAME1),
                Enter.theValue(email).into(RegistroUsuarioPage.EMAIL_CONFIRM),
                Enter.theValue(contraseña).into(RegistroUsuarioPage.PASSWORD),
                //Click.on(RegistroUsuarioPage.getDay("21")),
                Click.on(RegistroUsuarioPage.DAY),
                Click.on(RegistroUsuarioPage.MONTH),
                Click.on(RegistroUsuarioPage.YEAR),
                Enter.theValue(nombre).into(RegistroUsuarioPage.FIRST_NAME),
                Enter.theValue(apellido).into(RegistroUsuarioPage.LAST_NAME),
                Enter.theValue(compañia).into(RegistroUsuarioPage.COMPANY),
                Enter.theValue(direccion).into(RegistroUsuarioPage.ADDRESS),
                Enter.theValue(ciudad).into(RegistroUsuarioPage.CITY),
                Click.on(RegistroUsuarioPage.STATE),
                Enter.theValue(codigoPostal).into(RegistroUsuarioPage.POSTAL_CODE),
                Click.on(RegistroUsuarioPage.COUNTRY),
                Enter.theValue(telefono).into(RegistroUsuarioPage.PHONE),
                Enter.theValue(direccion).into(RegistroUsuarioPage.ADDRESS_CONFIRM),
                Click.on(RegistroUsuarioPage.CONFIRM)
        );
    }
    public static RegistroUsuario registroUsuario(Map <String, String> dataRegistro) {
        return instrumented(RegistroUsuario.class, dataRegistro);
    }
}
