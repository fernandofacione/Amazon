package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resultado {
    WebDriver driver;

    // O texto onde fica escrito Curso > "Nome do Curso"
    @FindBy (css = "h2")
    WebElement indicadorDeProduto;

    @FindBy (css = "https://www.amazon.com.br/Placa-Asus-STRIX-B550-GAMING/dp/B08GH2D4R6/ref=sr_1_3?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=asus+strix+b550-f+gaming+amd&qid=1632699470&sr=8-3&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147")
    WebElement btnProduto;

    @FindBy (css = "span.comprar")
    WebElement btnCarrinho;

    public Resultado(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String lerIndicadorDeProduto() {
        return indicadorDeProduto.getText();

    }

    public void clicarProduto(){
        btnProduto.click();
    }

    public void clicarCarrinho(){
        btnCarrinho.click();

    }

    public By verificarElemento() {
        return By.cssSelector("h3");
    }
}
