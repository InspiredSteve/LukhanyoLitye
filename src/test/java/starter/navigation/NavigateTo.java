package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theTakealotHomePage() {
        return Task.where("{0} opens the Takealot home page",
                Open.browserOn().the(TakealotHomePage.class));
    }
    public static Performable theCartBasketPage() {
        return Task.where("{0} selects the mini cart checkout",
                Open.browserOn().the(CartBasketPage.class));
    }
}
