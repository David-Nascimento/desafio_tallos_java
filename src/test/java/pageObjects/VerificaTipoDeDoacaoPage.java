package pageObjects;

import org.openqa.selenium.WebDriver;

import baseClass.BasePage;

public class VerificaTipoDeDoacaoPage extends BasePage {
	
	public VerificaTipoDeDoacaoPage(WebDriver _browser) {
		super(_browser);
	}
	private String URL = "http://ec2-18-219-166-8.us-east-2.compute.amazonaws.com:3000/";
	
	public void abrirPagina() {
		browser.get(URL);
	}

	
}
