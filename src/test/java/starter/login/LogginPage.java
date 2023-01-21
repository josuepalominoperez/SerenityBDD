package starter.login;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static starter.login.User.Cantante_2024;
import static starter.login.User.Cantante_2025;

@RunWith(SerenityRunner.class)
public class LogginPage extends UIInteractions {

    @Managed
    WebDriver driver;


    @Steps
    LoginActions usuario1;

    @Test
    public void demoLoginPage() throws InterruptedException {
       usuario1.escribe(Cantante_2025);
       usuario1.clickea_en_boton_login();
       usuario1.verifica();

    }
}


//Para tener un reporte poder correr mvn serenity:aggregate