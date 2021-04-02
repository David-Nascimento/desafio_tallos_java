package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.BasePage;

public class PaginaInicialPage extends BasePage {
	
	public PaginaInicialPage(WebDriver _browser) {
		super(_browser);
	}
	private String URL = "http://ec2-18-219-166-8.us-east-2.compute.amazonaws.com:3000/";
	private By campoDoacao = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/p");
	private By campoSolicitacoes = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div[2]/p");
	
	public void abrirPagina() {
		browser.get(URL);
	}

	public void validaPaginaInicial() {
		String pageInicial = browser.getCurrentUrl();
		Assert.assertEquals("http://ec2-18-219-166-8.us-east-2.compute.amazonaws.com:3000/", pageInicial);
	}

	public void verificaExisteDoacao() throws InterruptedException {
		String valorCampoDoacao = browser.findElement(campoDoacao).getText();
		Assert.assertEquals("Não foi possível listar as categorias de doações!", valorCampoDoacao);
		Thread.sleep(2000);
	}
	
	// Cenario 2
	public void verificaExisteSolicitacoesRecentes() throws InterruptedException {
		positionScreenOn(campoSolicitacoes);
		Thread.sleep(2000);
		waitElementVisible(campoDoacao, 1500);
		
		String solicitacoes = browser.findElement(campoSolicitacoes).getText();
		Assert.assertEquals("Não foi possível listar as solicitações!", solicitacoes);
	}

	
}
