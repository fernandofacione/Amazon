$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comprarProdPO.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Comprar Produto PO",
  "description": "",
  "id": "comprar-produto-po",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 1771332200,
  "status": "passed"
});
formatter.before({
  "duration": 69100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Pesquisar Produto com Clique e Incluir no Carrinho PO",
  "description": "",
  "id": "comprar-produto-po;pesquisar-produto-com-clique-e-incluir-no-carrinho-po",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso o site da Amazon  PO",
  "keyword": "Dado "
});
formatter.step({
  "line": 5,
  "name": "pesquiso por \"Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster\" PO",
  "keyword": "Quando "
});
formatter.step({
  "line": 6,
  "name": "clico na Lupa PO",
  "keyword": "E "
});
formatter.step({
  "line": 7,
  "name": "vejo a lista de resultados para o produto \"Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster\" PO",
  "keyword": "Entao "
});
formatter.step({
  "line": 8,
  "name": "clico no Produto PO",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "clico em Adicionar ao Carrinho PO",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "confirmo o nome do produto como \"Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster\" e o preco de \"R$ 1199.00\" PO",
  "keyword": "Entao "
});
formatter.match({
  "location": "comprarProdPO.queAcessoOSiteDaIterasysPO()"
});
formatter.result({
  "duration": 2588998400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster",
      "offset": 14
    }
  ],
  "location": "comprarProdPO.pesquisoPorProdutoPO(String)"
});
formatter.result({
  "duration": 400709000,
  "status": "passed"
});
formatter.match({
  "location": "comprarProdPO.clicoLupaPO()"
});
formatter.result({
  "duration": 3645144700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster",
      "offset": 43
    }
  ],
  "location": "comprarProdPO.vejoAListaDeResultadosParaOProdutoPO(String)"
});
formatter.result({
  "duration": 6084555900,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element found by By.cssSelector: h3 to have text \"rodutos › \"Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster\"\". Current text: \"null\" (tried for 5 second(s) with 1 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NANINE\u0027, ip: \u0027192.168.100.80\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\ferna\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58155}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6b1cdca95efecf51a687f280d22540f3\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat PassosPO.comprarProdPO.vejoAListaDeResultadosParaOProdutoPO(comprarProdPO.java:68)\r\n\tat ✽.Entao vejo a lista de resultados para o produto \"Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster\" PO(comprarProdPO.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "comprarProdPO.clicoNoProdutoPO()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "comprarProdPO.clicoAdicionarCarrinhoPO()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cafeteira Expresso Prima Latte II, Vermelho, 110v, Oster",
      "offset": 33
    },
    {
      "val": "R$ 1199.00",
      "offset": 105
    }
  ],
  "location": "comprarProdPO.confirmoONomeDoProdutoComoEOPrecoDePO(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 654736600,
  "status": "passed"
});
formatter.after({
  "duration": 60600,
  "status": "passed"
});
});