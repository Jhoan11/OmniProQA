package omnipro.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage extends PageObject {
    public static final Target LNK_REGISTER= Target.the("Register in product")
            .located(By.id("signin2"));

    public static final Target INPUT_USERNAME_REGISTER= Target.the("Username")
            .located(By.id("sign-username"));
    public static final Target INPUT_PASSWORD_REGISTER= Target.the("Password")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTER= Target.the("Log in ")
            .located(By.xpath("//button[@type='button'][contains(.,'Sign up')]"));

}