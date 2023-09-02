package omnipro.automation.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static omnipro.automation.ui.CategorieProductsPage.*;
import static omnipro.automation.ui.LoginPage.*;

public class ProductosPorCategoria implements Task {
    public static ProductosPorCategoria comoUsuarioLogueado() {
        return Instrumented.instanceOf(ProductosPorCategoria.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(LNK_LOG_IN),
                Enter.theValue("Usuario Registro").into(INPUT_USERNAME),
                Enter.theValue("*/569test").into(INPUT_PASSWORD),
                JavaScriptClick.on (BTN_LOGIN),
                JavaScriptClick.on (BTN_PHONES),
                JavaScriptClick.on (BTN_LAPTOPS),
                JavaScriptClick.on (BTN_MONITORS),
                JavaScriptClick.on (BTN_MONITOR_DETAIL),
                JavaScriptClick.on (BTN_ADD_MONITOR)
        );
    }
}
