package co.com.prueba.qvision.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ComprarVestidoPage extends PageObject {
    public static final Target PRINCIPAL = Target.the("Pagina Principal").located(By.xpath("//*[@id='header_logo']/a/img"));
    public static final Target DRESSES = Target.the("Menu vestidos").located(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
    public static final Target EVENINGDRESSES = Target.the("Submenu vestidos").located(By.xpath("//*[@id='subcategories']/ul/li[2]/div[1]/a/img"));
    public static final Target ITEM = Target.the("Vestido a comprar").located(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a"));
    public static final Target ADD = Target.the("Agregar compra").located(By.xpath("//*[@id='add_to_cart']/button/span"));
    public static final Target PROCEED = Target.the("Continuar con la compra").located(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
    public static final Target PROCEED2 = Target.the("Continuar con la compra").located(By.xpath("//*[@id='center_column']/p[2]/a[1]/span"));
    public static final Target CHECKOUT = Target.the("Continuar").located(By.xpath("//*[@id='center_column']/form/p/button/span"));
    public static final Target TERMSSERVICE = Target.the("Aceptar terminos del servicio").located(By.id("cgv"));
    public static final Target CHECKOUT2 = Target.the("Continuar").located(By.xpath("//*[@id='form']/p/button/span"));
    public static final Target PAYBAYCHECK = Target.the("Pago con cheque").located(By.xpath("//*[@id='HOOK_PAYMENT']/div[2]/div/p/a"));
    public static final Target CONFIRM = Target.the("Confirmar compra").located(By.xpath("//*[@id='cart_navigation']/button/span"));
    public static final Target SUCCESS = Target.the("nombre del vestido a comprar").located(By.xpath("//*[@id='center_column']/p[1]"));

}
