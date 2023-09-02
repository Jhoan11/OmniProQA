package omnipro.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
public class ProductsBuyPage extends PageObject {
    public static final Target BTN_PRODUCT_HOME= Target.the("Product in home")
            .located (By.xpath ("//a[@href='prod.html?idp_=2'][contains(.,'Nokia lumia 1520')]"));
    public static final Target BTN_ADD_TO_CART= Target.the("Add to cart")
            .located(By.xpath ("//a[contains(@onclick,'addToCart(2)')]"));
    public static final Target BTN_CART_HEADER= Target.the("Button Cart")
            .located(By.id("cartur"));
    public static final Target BTN_FINAL_PURCHASE= Target.the("Log in ")
            .located(By.xpath("//button[contains(@class,'btn btn-success')]"));
    public static final Target INPUT_NAME_PURCHASE= Target.the ( "Nombre de compra" )
            .located ( By.id("name"));
    public static final Target INPUT_COUNTRY_PURCHASE= Target.the ( "País de compra" )
            .located ( By.id("country"));
    public static final Target INPUT_CITY_PURCHASE= Target.the ( "Nombre de compra" )
            .located ( By.id("city"));
    public static final Target INPUT_CREDIT_CARD_PURCHASE= Target.the ( "Tarjeta de pago de compra" )
            .located ( By.id("card"));
    public static final Target INPUT_MONTH_PURCHASE= Target.the ( "Nombre de compra" )
            .located ( By.id("month"));
    public static final Target INPUT_YEAR_PURCHASE= Target.the ( "Año de vencimiento de tarjeta de compra" )
            .located ( By.id ("year"));
    public static final Target BTN_FINAL_PURCHASE_TEST= Target.the ( "Año de vencimiento de tarjeta de compra" )
            .located ( By.xpath ("//button[@type='button'][contains(.,'Purchase')]"));
}
