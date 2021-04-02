package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BasePage;

public class CategoriaDoacaoPage extends BasePage {
	
	public CategoriaDoacaoPage(WebDriver _browser) {
		super(_browser);
	}
	private String URL = "http://ec2-18-219-166-8.us-east-2.compute.amazonaws.com:3000";
	
	public void abrirPagina() {
		browser.get(URL);
	}

	public void validaPaginaInicial() {
		String pageInicial = browser.getCurrentUrl();
		Assert.assertEquals("http://ec2-18-219-166-8.us-east-2.compute.amazonaws.com:3000", pageInicial);
	}

	
}
