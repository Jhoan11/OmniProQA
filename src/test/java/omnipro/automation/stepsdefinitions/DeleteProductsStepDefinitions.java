package omnipro.automation.stepsdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omnipro.automation.tasks.EliminaProductos;
import omnipro.automation.tasks.LanzarNavegador;
import omnipro.automation.tasks.LogueoUsuario;

public class DeleteProductsStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} ingreso a la pagina como logueado")
    public void queIngresoALaPaginaComoLogueado(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                LanzarNavegador.paraLaPrueba()
        );
    }
    @When("agrego y elimino productos del carrito")
    public void agregoYEliminoProductosDelCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EliminaProductos.enElCarrito()
        );
    }
    @Then("valido la eliminación de productos")
    public void validoLaEliminacionDeProductos() {
    }
}
