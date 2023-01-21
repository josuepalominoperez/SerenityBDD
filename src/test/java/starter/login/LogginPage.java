package starter.login;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LogginPage extends UIInteractions {

    @Managed
    WebDriver driver;


    @Steps
    LoginActions login;

    @Test
    public void demoLoginPage() {
        login.asUserStandar();

    }
}
