package co.com.prueba.qvision.interactions;

import co.com.prueba.qvision.userinterface.MailPage;
import co.com.prueba.qvision.util.ObtenerArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubirArchivo implements Task {

    private String rutaArchivo;
    public SubirArchivo(){
        ObtenerArchivo rutaArchivo = new ObtenerArchivo();
        this.rutaArchivo = rutaArchivo.esperaDescarga();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        MailPage.ATTACHFILE.resolveFor(actor).sendKeys(this.rutaArchivo);
    }

    public static SubirArchivo subirArchivo(){
        return instrumented(SubirArchivo.class);
    }
}
