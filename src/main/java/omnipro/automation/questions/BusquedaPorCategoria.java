package omnipro.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static omnipro.automation.ui.CategorieProductsPage.BTN_PHONES;



public class BusquedaPorCategoria implements Question<Boolean> {
    public static BusquedaPorCategoria veoProductos() {
        return new BusquedaPorCategoria ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_PHONES.isVisibleFor(actor);
    }
}
