package stepsDefinitions;

import baseClass.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.VerificaTipoDeDoacaoPage;

public class VerificaTipoDeDoacao extends BaseSteps {
	
	VerificaTipoDeDoacaoPage paginaInicial = new VerificaTipoDeDoacaoPage(BaseSteps.browser);
	
	@Dado("^que eu acesse a pagina Vitrine Social$")
	public void queEuAcesseAPaginaVitrineSocial() throws Throwable {
		paginaInicial.abrirPagina();
	}

	@Quando("^eu estiver na pagira home$")
	public void euEstiverNaPagiraHome() throws Throwable {
	    
	}

	@Entao("^devo ver se existe alguma doa??o por tipo$")
	public void devoVerSeExisteAlgumaDoaOPorTipo() throws Throwable {
	   
	}
	
}
