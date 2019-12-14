package co.com.prueba.qvision.tasks;

import co.com.prueba.qvision.userinterface.ComprarVestidoPage;
import co.com.prueba.qvision.userinterface.ProfilePage;
import co.com.prueba.qvision.userinterface.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Profile implements Task {
    @Override
    @Step("{3} descarga el recibo de pago")
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(ProfilePage.PROFILE),
            WaitUntil.the(ProfilePage.ORDER_HISTORY, isVisible()),
            Click.on(ProfilePage.ORDER_HISTORY),
            WaitUntil.the(ProfilePage.DOWNLOAD_ORDER, isVisible()),
            Click.on(ProfilePage.DOWNLOAD_ORDER)
    );
    }

    public static Profile profile() {
        return instrumented(Profile.class);
    }
}
