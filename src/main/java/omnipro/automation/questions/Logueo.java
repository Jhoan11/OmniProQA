package omnipro.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static omnipro.automation.ui.LoginPage.LNK_LOG_IN;


public class Logueo implements Question<Boolean> {
    public static Logueo veoLogIn() {
        return new Logueo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LNK_LOG_IN.isVisibleFor(actor);
    }
}
