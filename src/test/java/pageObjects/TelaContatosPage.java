package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.BasePage;


public class TelaContatosPage extends BasePage {
	
	public TelaContatosPage(WebDriver _browser) {
		super(_browser);
	}
	private By contato = By.cssSelector("[href=\"/contato\"]");
	private By name = By.id("name");
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By comboBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/form/div[4]/div/div/span/div/div/div");
	private By sugestao = By.cssSelector("/html/body/div[3]/div/div/div/ul/li[3]");
	private By msg = By.id("message");
	private By enviar = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/form/div[6]/div/div/span/button");
	
	private By msgErroEnvioMsg = By.xpath("/html/body/div[4]/div/span/div");
	
	
	public void acessaTelaContato() {
		waitElementClickable(contato, 2500);
		browser.findElement(contato).click();
		
		//Verifica se esta na tela de contato
		String contatos = browser.getCurrentUrl();
		Assert.assertEquals("http://ec2-18-219-166-8.us-east-2.compute.amazonaws.com:3000/contato", contatos);
	}

	public void encaminhaFormularioPreenchido() throws InterruptedException {
		waitElementClickable(name, 1000);
		browser.findElement(name).sendKeys("David Halison");
		browser.findElement(email).sendKeys("teste@testes.io");
		browser.findElement(phone).sendKeys("85 99999-9999");
		Thread.sleep(1000);
		browser.findElement(comboBox).click();
		browser.findElement(sugestao).click();
		browser.findElement(msg).sendKeys("uma mensagem de teste para efetivar o formulario");
		
	}

	public void enviaFormularioDeContato() {
		browser.findElement(enviar).click();
		boolean alerta = browser.findElement(msgErroEnvioMsg).isDisplayed();
		
		if (alerta != true)
			waitElementVisible(msgErroEnvioMsg, 2000);
		
	}
	
}
