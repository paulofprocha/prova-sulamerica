package br.com.sulamerica.pages;

import br.com.sulamerica.common.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.time.Duration;

public class CadastroPage extends BasePage {

    private final By campoNome = By.id("nome_cad");

    private final By campoEmail = By.id("email_cad");

    private final By campoSenha = By.id("senha_cad");

    private final By botaoCadastrar = By.cssSelector("#cadastro > form > p:nth-child(5) > input[type=submit]");

    private final By mensagemFinal = By.cssSelector("body > center > h1");

    public void realizarCadastro() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(campoNome).sendKeys("Nome Teste Sulamerica");
        driver.findElement(campoEmail).sendKeys("teste@teste.com.br");
        driver.findElement(campoSenha).sendKeys("123456");
        driver.findElement(botaoCadastrar).click();
        driver.switchTo().alert().accept();
    }

    public void validarMensagemRetorno() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String textoMensagem = driver.findElement(mensagemFinal).getText();
        Assert.assertEquals("405 Not Allowed", textoMensagem);
        System.out.println("Mensagem final: " + textoMensagem + " validada com sucesso!");
    }
}
