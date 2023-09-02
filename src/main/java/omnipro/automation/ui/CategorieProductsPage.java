package omnipro.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CategorieProductsPage extends PageObject {
    public static final Target BTN_PHONES= Target.the("Log in product")
            .located(By.xpath ("//a[@href='#'][contains(.,'Phones')]"));
    public static final Target BTN_LAPTOPS= Target.the("Username")
            .located(By.xpath ("//a[@href='#'][contains(.,'Laptops')]"));
    public static final Target BTN_MONITORS= Target.the("Password")
            .located(By.xpath ("//a[@href='#'][contains(.,'Monitors')]"));
    public static final Target BTN_MONITOR_DETAIL= Target.the ("Add monitor product")
            .located (By.xpath ( "//a[contains(.,'ASUS Full HD')]" ));
    public static final Target BTN_ADD_MONITOR= Target.the ("Add monitor product")
            .located (By.xpath ( "//a[contains(@onclick,'addToCart(14)')]" ));
}
