package omnipro.automation.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static omnipro.automation.ui.LoginPage.*;

public class LogueoUsuario implements Task {


    public static LogueoUsuario conLasCredenciales() {
        return Instrumented.instanceOf(LogueoUsuario.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(LNK_LOG_IN),
                Enter.theValue("jhoan").into(INPUT_USERNAME),
                Enter.theValue("Sebas9703").into(INPUT_PASSWORD),
                JavaScriptClick.on(BTN_LOGIN)
        );
    }
}
