package omnipro.automation.stepsdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omnipro.automation.questions.Logueo;
import omnipro.automation.tasks.LanzarNavegador;
import omnipro.automation.tasks.LogueoUsuario;
import omnipro.automation.tasks.RegistroUsuario;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} ingresa a la pagina")
    public void queIngresoALaPagina(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                LanzarNavegador.paraLaPrueba()
        );
    }
    @When("registro las credenciales de acceso")
    public void registroLasCredencialesDeAcceso() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroUsuario.conCredenciales()
        );
    }
    @Then("valido el correcto registro")
    public void validoElCorrectoRegistro() {

    }

}
