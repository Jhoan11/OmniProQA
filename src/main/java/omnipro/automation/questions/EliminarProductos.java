package omnipro.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static omnipro.automation.ui.LoginPage.LNK_LOG_IN;

public class EliminarProductos implements Question<Boolean> {
    public static EliminarProductos veoProductos() {
        return new EliminarProductos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LNK_LOG_IN.isVisibleFor(actor);
    }
}