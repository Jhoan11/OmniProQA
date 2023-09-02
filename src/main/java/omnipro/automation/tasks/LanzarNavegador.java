package omnipro.automation.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import omnipro.automation.ui.LoginPage;

public class LanzarNavegador extends PageObject {
    public static Performable paraLaPrueba() {
        return Task.where(
                actor -> {
                    Open.browserOn().the(LoginPage.class).performAs(actor);
                    Serenity.setSessionVariable("url").to(Serenity.getDriver().getCurrentUrl());
                }
        );
    }
}
