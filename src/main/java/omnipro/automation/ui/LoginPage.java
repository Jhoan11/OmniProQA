package omnipro.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage extends PageObject {
    public static final Target LNK_LOG_IN= Target.the("Log in product")
            .located(By.id("login2"));

    public static final Target INPUT_USERNAME= Target.the("Username")
            .located(By.id("loginusername"));
    public static final Target INPUT_PASSWORD= Target.the("Password")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOGIN= Target.the("Log in ")
            .located(By.xpath("//*[@onclick='logIn()']"));
    public static final Target BTN_LOG_OUT= Target.the("Log in product")
            .located(By.id("logout2"));
}
