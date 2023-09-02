package omnipro.automation.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static omnipro.automation.ui.LoginPage.*;
import static omnipro.automation.ui.RegisterPage.*;

public class RegistroUsuario implements Task {


    public static RegistroUsuario conCredenciales() {
        return Instrumented.instanceOf(RegistroUsuario.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(LNK_REGISTER),
                Enter.theValue("Usuario Registro").into(INPUT_USERNAME_REGISTER),
                Enter.theValue("*/569test").into(INPUT_PASSWORD_REGISTER),
                JavaScriptClick.on(BTN_REGISTER)
        );


    }
}
