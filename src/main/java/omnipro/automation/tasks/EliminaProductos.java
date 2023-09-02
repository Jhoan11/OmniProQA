package omnipro.automation.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static omnipro.automation.ui.DeleteProductsPage.BTN_DELETE_PRODUCT;
import static omnipro.automation.ui.LoginPage.*;
import static omnipro.automation.ui.ProductsBuyPage.*;

public class EliminaProductos implements Task {


    public static EliminaProductos enElCarrito() {
        return Instrumented.instanceOf(EliminaProductos.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(LNK_LOG_IN),
                Enter.theValue("Usuario Registro").into(INPUT_USERNAME),
                Enter.theValue("*/569test").into(INPUT_PASSWORD),
                JavaScriptClick.on(BTN_LOGIN),
                JavaScriptClick.on(BTN_PRODUCT_HOME),
                JavaScriptClick.on (BTN_ADD_TO_CART),
                JavaScriptClick.on(BTN_CART_HEADER),
                JavaScriptClick.on (BTN_DELETE_PRODUCT)
        );
    }
}
