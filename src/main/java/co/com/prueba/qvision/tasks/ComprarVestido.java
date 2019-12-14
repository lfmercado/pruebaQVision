package co.com.prueba.qvision.tasks;

import co.com.prueba.qvision.userinterface.ComprarVestidoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ComprarVestido implements Task {
    
    @Override
    @Step("{2} se realiza una compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ComprarVestidoPage.PRINCIPAL, isVisible()),
                Click.on(ComprarVestidoPage.PRINCIPAL),
                Click.on(ComprarVestidoPage.DRESSES),
                WaitUntil.the(ComprarVestidoPage.EVENINGDRESSES, isVisible()),
                Click.on(ComprarVestidoPage.EVENINGDRESSES),
                WaitUntil.the(ComprarVestidoPage.ITEM, isVisible()),
                Click.on(ComprarVestidoPage.ITEM),
                WaitUntil.the(ComprarVestidoPage.ADD, isVisible()),
                Click.on(ComprarVestidoPage.ADD),
                Click.on(ComprarVestidoPage.PROCEED),
                Click.on(ComprarVestidoPage.PROCEED2),
                Click.on(ComprarVestidoPage.CHECKOUT),
                Click.on(ComprarVestidoPage.TERMSSERVICE),
                Click.on(ComprarVestidoPage.CHECKOUT2),
                Click.on(ComprarVestidoPage.PAYBAYCHECK),
                Click.on(ComprarVestidoPage.CONFIRM)
        );
    }

    public static ComprarVestido Buy() {
        return instrumented(ComprarVestido.class);
    }
}
