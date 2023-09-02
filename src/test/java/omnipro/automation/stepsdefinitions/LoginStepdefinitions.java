package omnipro.automation.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omnipro.automation.questions.Logueo;
import omnipro.automation.tasks.LanzarNavegador;
import omnipro.automation.tasks.LogueoUsuario;

public class LoginStepdefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} ingreso a la pagina")
    public void queIngresoALaPagina(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                LanzarNavegador.paraLaPrueba()
                );
    }
    @When("ingreso las credenciales de acceso")
    public void ingresoLasCredencialesDeAcceso() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogueoUsuario.conLasCredenciales()
        );
    }
    @Then("valido el correcto acceso")
    public void validoElCorrectoAcceso() {
    }
}
