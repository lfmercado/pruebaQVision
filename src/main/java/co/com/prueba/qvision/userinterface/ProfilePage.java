package co.com.prueba.qvision.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProfilePage extends PageObject {

    public static final Target PROFILE =Target.the("perfil del usuario").located(By.xpath("//div//a[@class='account']"));
    public static final Target ORDER_HISTORY = Target.the("historial de compras").located(By.xpath("//div//ul//li//a//i[@class='icon-list-ol']"));
    public static final Target DOWNLOAD_ORDER = Target.the("descargar pdf de compra").located(By.xpath("//tr//td//a[@title='Invoice']"));

}
