package PassosPO;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Home;
import pages.Resultado;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class comprarProdPO {
    WebDriver driver;
    WebDriverWait wait;

    Home home;
    Resultado resultado;

    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/92/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 5,1);
        home = new Home(driver);
        resultado = new Resultado(driver);

        System.out.println("Passo 0-Classe");
    }

    @After
    public void finalizar(){
        driver.quit();
        System.out.println("Passo Z-Classe");
    }

    @Dado("^que acesso o site da Amazon  PO$")
    public void queAcessoOSiteDaIterasysPO() {
        driver.get("https://amazon.com.br");
        System.out.println("Passo 1");
    }

    @Quando("^pesquiso por \"([^\"]*)\" PO$")
    public void pesquisoPorProdutoPO(String produto)  {
        home.pesquisarProduto(produto);
        System.out.println("Passo 2");
    }

    @E("^clico na Lupa PO$")
    public void clicoLupaPO() {
        home.clicarLupa();
        System.out.println("Passo 3");
    }

    @Entao("^vejo a lista de resultados para o curso \"([^\"]*)\" PO$")
    public void vejoAListaDeResultadosParaOProdutoPO(String produto) {
        String textoEsperado = "Produtos › \"" + produto + "\"";
        wait.until(ExpectedConditions.textToBe(resultado.verificarElemento(),textoEsperado));
        assertEquals(resultado.lerIndicadorDeProduto(), textoEsperado);
        System.out.println("Passo 4");
    }

    @Quando("^clico no Produto PO$")
    public void clicoNoProdutoPO() {
        resultado.clicarProduto();
        System.out.println("Passo 5");
    }

    @Quando("^clico em Adicionar ao Carrinho PO$")
    public void clicoAdicionarCarrinhoPO() {
        resultado.clicarCarrinho();
        System.out.println("Passo 6");
    }

    @Entao("^confirmo o nome do curso como \"([^\"]*)\" e o preco de \"([^\"]*)\" PO$")
    public void confirmoONomeDoProdutoComoEOPrecoDePO(String arg0, String arg1)  {
        System.out.println("Passo 7");
    }

}