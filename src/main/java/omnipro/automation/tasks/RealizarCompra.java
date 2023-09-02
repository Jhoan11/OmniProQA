package omnipro.automation.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static omnipro.automation.ui.LoginPage.*;
import static omnipro.automation.ui.LoginPage.BTN_LOGIN;
import static omnipro.automation.ui.ProductsBuyPage.*;

public class RealizarCompra implements Task {

    public static RealizarCompra comoRegistrado() {
        return Instrumented.instanceOf( RealizarCompra.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(LNK_LOG_IN),
                Enter.theValue("Usuario Registrado").into(INPUT_USERNAME),
                Enter.theValue("*/569test").into(INPUT_PASSWORD),
                JavaScriptClick.on(BTN_LOGIN),
                JavaScriptClick.on(BTN_PRODUCT_HOME),
                JavaScriptClick.on (BTN_ADD_TO_CART),
                JavaScriptClick.on (BTN_CART_HEADER),
                WaitUntil.the(BTN_FINAL_PURCHASE, isVisible()),
                JavaScriptClick.on (BTN_FINAL_PURCHASE),
                Enter.theValue("Usuario de Prueba de compra").into(INPUT_NAME_PURCHASE),
                Enter.theValue("Colombia").into(INPUT_COUNTRY_PURCHASE),
                Enter.theValue("Bogotá").into(INPUT_CITY_PURCHASE),
                Enter.theValue("2556987832659874").into(INPUT_CREDIT_CARD_PURCHASE),
                Enter.theValue("12").into(INPUT_MONTH_PURCHASE),
                Enter.theValue("2029").into(INPUT_YEAR_PURCHASE),
                JavaScriptClick.on(BTN_FINAL_PURCHASE_TEST)
        );
    }
}
