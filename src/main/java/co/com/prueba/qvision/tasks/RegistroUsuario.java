package co.com.prueba.qvision.tasks;

import co.com.prueba.qvision.userinterface.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistroUsuario implements Task {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String day;
    RegistroUsuario(String nombre, String apellido, String telefono, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        RegistroUsuarioPage registro = new RegistroUsuarioPage();
        registro.setDay(day);
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
                Enter.theValue("password").into(RegistroUsuarioPage.PASSWORD),
                Click.on(RegistroUsuarioPage.DAY),
                Click.on(RegistroUsuarioPage.MONTH),
                Click.on(RegistroUsuarioPage.YEAR),
                Enter.theValue(nombre).into(RegistroUsuarioPage.FIRST_NAME),
                Enter.theValue(apellido).into(RegistroUsuarioPage.LAST_NAME),
                Enter.theValue("Qvision").into(RegistroUsuarioPage.COMPANY),
                Enter.theValue("Calasanz").into(RegistroUsuarioPage.ADDRESS),
                Enter.theValue("Medellin").into(RegistroUsuarioPage.CITY),
                Click.on(RegistroUsuarioPage.STATE),
                Enter.theValue("0050035").into(RegistroUsuarioPage.POSTAL_CODE),
                Click.on(RegistroUsuarioPage.COUNTRY),
                Enter.theValue(telefono).into(RegistroUsuarioPage.PHONE),
                Enter.theValue("Cra 11").into(RegistroUsuarioPage.ADDRESS_CONFIRM),
                Click.on(RegistroUsuarioPage.CONFIRM)
        );
    }
    public static RegistroUsuario registroUsuario(String nombre, String apellido, String telefono, String email) {
        return instrumented(RegistroUsuario.class, nombre,apellido,telefono,email);
    }
}
