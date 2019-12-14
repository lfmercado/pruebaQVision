package co.com.prueba.qvision.tasks;

import co.com.prueba.qvision.interactions.SubirArchivo;
import co.com.prueba.qvision.userinterface.MailPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.Map;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnviarCorreo implements Task {

    private String mail;
    private String contraseña;
    private String receiver;
    private String reason;
    private String bodyMessage;

    public EnviarCorreo(Map <String,String> dataMail){
        this.mail = dataMail.get("usurio");
        this.contraseña = dataMail.get("contraseñaMail");
        this.reason = dataMail.get("reason");
        this.receiver = dataMail.get("receiver");
        this.bodyMessage = dataMail.get("bodyMessage");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( WaitUntil.the(MailPage.INPUTMAIL, isVisible()),
                Enter.theValue(this.mail).into(MailPage.INPUTMAIL),
                Click.on(MailPage.BTNNEXT),
                WaitUntil.the(MailPage.INPUTPASSWORD, isVisible()),
                Enter.theValue(this.contraseña).into(MailPage.INPUTPASSWORD),
                Click.on(MailPage.BTNNEXT),
                WaitUntil.the(MailPage.BTNWRITEEMAIL, isVisible()),
                Click.on(MailPage.BTNWRITEEMAIL),
                WaitUntil.the(MailPage.RECEIVER, isVisible()),
                Enter.theValue(this.receiver).into(MailPage.RECEIVER),
                Enter.theValue(this.reason).into(MailPage.REASON),
                Enter.theValue(this.bodyMessage).into(MailPage.BODYMESSAGE),
                SubirArchivo.subirArchivo(),
                Click.on(MailPage.SENDMAIL),
                Click.on(MailPage.SUBMITTED),
                WaitUntil.the(MailPage.MAILSEND , isVisible())
        );

        Serenity.setSessionVariable("correoEnviado").to(MailPage.MAILSEND.resolveFor(actor).getText());
    }
    public static EnviarCorreo envioCorreo(Map <String,String> dataMail){
        return instrumented(EnviarCorreo.class, dataMail);
    }
}
