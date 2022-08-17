package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddToCart {

    public static Performable addToCart() {
        return Task.where("{0} adds the product onto the cart ",
                Enter.keyValues()
                        .into(SearchForm.ADD_TO_CART_BUTTON)
                        .thenHit(Keys.ENTER)
        );
    }
}
