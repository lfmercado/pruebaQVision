package co.com.prueba.qvision.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class MailPage extends PageObject {
    public static final Target INPUTMAIL = Target.the("input para ingresar correo").located(By.id("identifierId"));
    public static final Target BTNNEXT = Target.the("boton de siguiente").located(By.xpath("//div//span[contains(text(),'Siguiente')]"));
    public static final Target INPUTPASSWORD = Target.the("input para ingresar contraseña").located(By.xpath("//div//input[@type='password']"));
    public static final Target BTNWRITEEMAIL = Target.the("boton para redactar correo").located(By.xpath("//div//div[contains(text(),'Redactar')]"));
    public static final Target ATTACHFILE = Target.the("boton para abjuntar archivo").located(By.xpath("//*[@name=\"Filedata\"]"));
    public static final Target RECEIVER = Target.the("destinatario del correo").located(By.xpath("//div//textarea[@aria-label='Para']"));
    public static final Target REASON  = Target.the("motivo del correo").located(By.xpath("//div//input[@placeholder='Asunto']"));
    public static final Target BODYMESSAGE = Target.the("cuerpo del mensaje").located(By.xpath("//div//div[@aria-label='Cuerpo del mensaje']"));
    public static final Target SUBMITTED = Target.the("correos enviados").located(By.xpath("//div//span//a[@title='Enviados']"));
    public static final Target SENDMAIL = Target.the("enviar correo").located(By.xpath("//div//div[contains(text(),'Enviar') and @role='button']"));
    public static final Target MAILSEND = Target.the("correo enviado").located(By.xpath("//div//span//span[contains(text(),'comprobante de compra')]"));
}
