package co.com.prueba.qvision.tasks;

import co.com.prueba.qvision.userinterface.UrlQVision;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenUrlQVision implements Task{
    private UrlQVision urlHome;

    public OpenUrlQVision(UrlQVision urlHome){
        this.urlHome = urlHome;
    }
    @Override
    @Step("{0} ingresa a la url principal ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(urlHome.Url())
        );
    }

    public static Performable openUrl(UrlQVision openUrl){
        return Tasks.instrumented(OpenUrlQVision.class, openUrl);
    }
}
