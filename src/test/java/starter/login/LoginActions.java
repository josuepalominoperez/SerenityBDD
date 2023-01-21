package starter.login;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractions {
    @Step("Log in as a standard user")
    public void asUserStandar() {
        openUrl("https://demoqa.com/login");

        $("id:userName").sendKeys("Anuel2023@");
        $("id:password").sendKeys("Anuel2023@");
        $("id:login").click();
    }
}
