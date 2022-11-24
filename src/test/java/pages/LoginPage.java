package pages;

import common.BasePage;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginPage extends BasePage {

    private final By campoEmail = By.id("email_login");

    private final By campoSenha = By.id("senha_login");

    private final By checkboxLogado = By.id("manterlogado");

    private final By botaoLogar = By.cssSelector("#login > form > p:nth-child(5) > input[type=submit]");

    public void realizarLogin() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(campoEmail).sendKeys("paulorochaqa@gmail.com");
        driver.findElement(campoSenha).sendKeys("123456");
        driver.findElement(checkboxLogado).click();
        driver.findElement(botaoLogar).click();
        driver.switchTo().alert().accept();
    }
}
