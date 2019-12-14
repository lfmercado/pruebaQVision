package co.com.prueba.qvision.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Comprobante implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String correoEnviado = "comprobante de compra";

        return correoEnviado.equals(Serenity.sessionVariableCalled("correoEnviado"));
    }
    public static Comprobante comprobante(){
        return new Comprobante();
    }
}
