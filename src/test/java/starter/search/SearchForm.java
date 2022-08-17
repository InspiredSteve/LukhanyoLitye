package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

class SearchForm {
    static Target SEARCH_FIELD = Target.the("search-field").located(By.className("search-field"));
    static Target ADD_TO_CART_BUTTON = Target.the("//*[@id=\"90331810\"]/div/div[4]/div/button").located(By.xpath("//*[@id=\"90331810\"]/div/div[4]/div/button"));

}
