package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.AddToCart;
import starter.search.LookForInformation;
import starter.search.ShoppingCart;

public class SearchStepDefinitions {

    @Given("{actor} opens up the Takealot Homepage")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theTakealotHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @And("{actor} adds the product onto the cart")
    public void adds_TheProductOntoTheCart(Actor actor) {
        actor.attemptsTo(
                AddToCart.addToCart()
        );
    }

    @And("{actor} selects the mini cart checkout")
    public void selectsTheMiniCartCheckout(Actor actor) {
        actor.wasAbleTo(NavigateTo.theCartBasketPage());
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(ShoppingCart.PRODUCT_ITEM).hasText(term)
        );
    }
}
