package steps;

import common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CadastroPage;
import pages.LoginPage;

public class StepsDefinitions {

    public BasePage basePage = new BasePage();

    public CadastroPage cadastroPage = new CadastroPage();

    public LoginPage loginPage = new LoginPage();

    @Before
    public void setupChrome() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }

    @After
    public void closeChrome() {
        BasePage.driver.quit();
    }

    @Given("que o browser foi iniciado")
    public void queOBrowserFoiIniciado() {
        basePage.initBrowser();
    }

    @Given("o usuario esta na pagina inicial")
    public void oUsuarioEstaNaPaginaInicial() {
        basePage.openURL();
    }

    @When("realizar o cadastro do usuario")
    public void realizarOCadastroDoUsuario() {
        cadastroPage.realizarCadastro();
    }

    @Then("a mensagem de retorno deve ser validada")
    public void aMensagemDeRetornoDeveSerValidada() {
        cadastroPage.validarMensagemRetorno();
    }

    @Given("o usuario esta na pagina de login")
    public void oUsuarioEstaNaPaginaDeLogin() {
        basePage.openUrlLogin();
    }

    @When("realizar o login com o usuario")
    public void realizarOLoginComOUsuario() {
        loginPage.realizarLogin();
    }
}
