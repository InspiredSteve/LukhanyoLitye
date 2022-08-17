package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCart {
    public static final Target PRODUCT_ITEM =  Target.the("cart-item-module_item-title_1M9cq").located(By.className("cart-item-module_item-title_1M9cq"));

    public static Performable openCart() {
        return Task.where("{0} adds the product onto the cart ",
                Enter.keyValues()
                        .into(SearchForm.ADD_TO_CART_BUTTON)
                        .thenHit(Keys.ENTER)
        );
    }
}
