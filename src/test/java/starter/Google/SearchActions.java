package starter.Google;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {

    @Step("Buscar '{0}'")
    public void searchBy(String keyword) {
        $(By.name("q")).sendKeys(keyword, Keys.ENTER);
    }
}
