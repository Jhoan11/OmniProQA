package omnipro.automation.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omnipro.automation.tasks.LanzarNavegador;
import omnipro.automation.tasks.LogueoUsuario;
import omnipro.automation.tasks.ProductosPorCategoria;

public class CategoriesStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} ingreso a la pagina como no registrado")
    public void queIngresoALaPaginaComoNoRegistrado(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                LanzarNavegador.paraLaPrueba()
        );
    }

    @When ("navego por las categorias del home")
    public void navegoPorLasCategoriasDelHome() {
        OnStage.theActorInTheSpotlight().attemptsTo (
                ProductosPorCategoria.comoUsuarioLogueado()
        );
    }

    @Then("valido el correcto funcionamiento")
    public void validoElCorrectoFuncionamiento() {

    }
}