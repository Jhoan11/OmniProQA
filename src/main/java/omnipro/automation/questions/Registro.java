package omnipro.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static omnipro.automation.ui.RegisterPage.LNK_REGISTER;


public class Registro implements Question<Boolean> {
    public static Registro veoRegistro() {
        return new Registro ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LNK_REGISTER.isVisibleFor(actor);
    }
}
