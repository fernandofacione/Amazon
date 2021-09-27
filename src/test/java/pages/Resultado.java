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

    @FindBy (css = "https://www.amazon.com.br/Cafeteira-Espresso-PrimaLatte-Oster-BVSTEM6701B-017/dp/B076HRL85S/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=Cafeteira+Expresso+Prima+Latte+II%2C+Vermelho%2C+110v%2C+Oster&qid=1632702286&sr=8-1&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147")
    WebElement btnProduto;

    @FindBy (css = "submit.add-to-cart")
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
