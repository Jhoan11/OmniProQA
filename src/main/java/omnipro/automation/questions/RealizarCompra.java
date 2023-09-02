package omnipro.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static omnipro.automation.ui.ProductsBuyPage.BTN_FINAL_PURCHASE;


public class RealizarCompra implements Question<Boolean> {
    public static RealizarCompra hagoCompra() {
        return new RealizarCompra ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_FINAL_PURCHASE.isVisibleFor(actor);
    }
}
