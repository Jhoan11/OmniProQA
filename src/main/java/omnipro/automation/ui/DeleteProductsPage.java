package omnipro.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DeleteProductsPage extends PageObject {
    public static final Target BTN_DELETE_PRODUCT= Target.the("Log in product")
            .located(By.xpath ("(//a[contains(.,'Delete')])[1]"));
}
