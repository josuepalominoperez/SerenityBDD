package starter.login;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractions {
    @Step("Given I type username and password in textfields written")
    public void escribe(User user) throws InterruptedException {
        openUrl("https://demoqa.com/login");
        $("id:userName").sendKeys(user.getUsername());
        $("id:password").sendKeys(user.getPassword());
        Thread.sleep(4000);
    }


    @Step("When I click in Login button")
    public void clickea_en_boton_login() throws InterruptedException {
        $("id:login").click();
        Thread.sleep(4000);
    }

    @Step("Then I verify logged user")
    public void verifica() throws InterruptedException {
        $("id:searchBox").click();
        Thread.sleep(4000);
    }
}
