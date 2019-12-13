package co.com.prueba.qvision.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioPage extends PageObject {

    public static final Target SIGN_IN = Target.the("Boton de iniciar sesion").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
    public static final Target EMAIL = Target.the("Campo ingresar correo").located(By.id("email_create"));
    public static final Target CREATE_ACCOUNT = Target.the("Boton Crear Cuenta").located(By.id("SubmitCreate"));
    public static final Target RADIO_BUTTON_MR = Target.the("Radio button Mr").located(By.id("id_gender1"));
    public static final Target FIRST_NAME1 = Target.the("Campo para ingresar nombre").located(By.id("customer_firstname"));
    public static final Target LAST_NAME1 = Target.the("Campo para ingresar apellido").located(By.id("customer_lastname"));
    public static final Target EMAIL_CONFIRM = Target.the("Campo para ingresar correo").located(By.id("email"));
    public static final Target PASSWORD = Target.the("Campo para ingresar contraseña").located(By.id("passwd"));
    public static final Target DAY = Target.the("Campo para ingresar dia").located(By.xpath("(//select//option[contains(text(),'21')])[1]"));
    public static final Target MONTH = Target.the("Campo para ingresar mes").located(By.xpath("//select//option[contains(text(),'September')]"));
    public static final Target YEAR = Target.the("Campo para ingresar año").located(By.xpath("//select//option[contains(text(),'1994')]"));
    public static final Target FIRST_NAME = Target.the("Campo para ingresar nombre").located(By.id("firstname"));
    public static final Target LAST_NAME = Target.the("Campo para ingresar apellido").located(By.id("lastname"));
    public static final Target COMPANY = Target.the("Campo para ingresar empresa").located(By.id("company"));
    public static final Target ADDRESS = Target.the("Campo para ingresar empresa").located(By.id("address1"));
    public static final Target CITY = Target.the("Campo para ingresar ciudad").located(By.id("city"));
    public static final Target STATE = Target.the("Campo para ingresar estado").located(By.xpath("//select//option[contains(text(),'Colorado')]"));
    public static final Target POSTAL_CODE = Target.the("Campo para ingresar codigo postal").located(By.id("postcode"));
    public static final Target COUNTRY = Target.the("Campo para ingresar la ciudad").located(By.id("id_country"));
    public static final Target PHONE = Target.the("Campo para ingresar el telefono").located(By.id("phone_mobile"));
    public static final Target ADDRESS_CONFIRM = Target.the("Campo para ingresar la direccion").located(By.id("alias"));
    public static final Target CONFIRM = Target.the("Boton para confirmar").located(By.id("submitAccount"));

    public Target setDay(String day){
        String daypath = "//select//option[contains(text(),'%s')])[1]";
        String.format(daypath, day);
        Target DAY2 = Target.the("Campo para ingresar dia").located(By.xpath(daypath));
        return DAY2;
    }
}
