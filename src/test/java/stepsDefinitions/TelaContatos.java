package stepsDefinitions;

import baseClass.BaseSteps;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.TelaContatosPage;

public class TelaContatos extends BaseSteps {
	
	TelaContatosPage pgContato = new TelaContatosPage(BaseSteps.browser);
	
	@Quando("^eu estiver na pagina de Contato$")
	public void euEstiverNaPaginaDeContato() throws Throwable {
		pgContato.acessaTelaContato();
	}

	@E("^preencher o formulario$")
	public void preencherOFormulario() throws Throwable {
	    pgContato.encaminhaFormularioPreenchido();
	}

	@Entao("^devo enviar o formulario para o contato da vitrine social$")
	public void devoEnviarOFormularioParaOContatoDaVitrineSocial() throws Throwable {
	    pgContato.enviaFormularioDeContato();
	}
}
