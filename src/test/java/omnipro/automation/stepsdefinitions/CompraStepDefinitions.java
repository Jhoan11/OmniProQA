package omnipro.automation.stepsdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omnipro.automation.tasks.LanzarNavegador;
import omnipro.automation.tasks.RealizarCompra;

public class CompraStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} está en el home de la página")
    public void queEstaEnElHomeDeLaPagina(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                LanzarNavegador.paraLaPrueba()
        );
    }
    @When("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RealizarCompra.comoRegistrado()
        );
    }
    @Then("valido que se haga la compra correctamente")
    public void validoQueSeHagaLaCompraCorrectamente() {

    }

}