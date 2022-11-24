package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;

    public String baseURL = "https://alexspalermo.github.io/AlexSPalermo.LoginCadastro.github.io/";

    public String baseUrlLogin = "https://alexspalermo.github.io/AlexSPalermo.LoginCadastro.github.io/#paralogin";

    public void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openURL() {
        driver.get(baseURL);
    }

    public void openUrlLogin() {
        driver.get(baseUrlLogin);
    }
}
