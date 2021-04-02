package stepsDefinitions;

import baseClass.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.CategoriaDoacaoPage;

public class CategoriaDoacao extends BaseSteps {
	
	CategoriaDoacaoPage paginaInicial = new CategoriaDoacaoPage(BaseSteps.browser);
	
	@Dado("^que eu acesse a pagina Vitrine Social$")
	public void queEuAcesseAPaginaVitrineSocial() throws Throwable {
		BaseSteps.screenShotNow();
		paginaInicial.abrirPagina();
		
	}

	@Quando("^eu estiver na pagira home$")
	public void euEstiverNaPagiraHome() throws Throwable {
	    paginaInicial.validaPaginaInicial();
	}

	@Entao("^devo ver se existe alguma doacao por tipo$")
	public void devoVerSeExisteAlgumaDocaOPorTipo() throws Throwable {
	   
	}
	
}
