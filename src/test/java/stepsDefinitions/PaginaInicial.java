package stepsDefinitions;

import baseClass.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageObjects.PaginaInicialPage;

public class PaginaInicial extends BaseSteps {

	PaginaInicialPage pgInicial = new PaginaInicialPage(BaseSteps.browser);

	@Dado("^que eu acesse a pagina Vitrine Social$")
	public void queEuAcesseAPaginaVitrineSocial() throws Throwable {
		BaseSteps.screenShotNow();
		pgInicial.abrirPagina();

	}

	@Quando("^eu estiver na pagira home$")
	public void euEstiverNaPagiraHome() throws Throwable {
		pgInicial.validaPaginaInicial();
	}

	@Entao("^devo ver se existe alguma doacao por tipo$")
	public void devoVerSeExisteAlgumaDocaOPorTipo() throws Throwable {
		pgInicial.verificaExisteDoacao();
	}

	// Cenario 2

	@Entao("^devo ver se exite alguma solicitacao Recente$")
	public void devoVerSeExiteAlgumaSolicitacaoRecente() throws Throwable {
		pgInicial.verificaExisteSolicitacoesRecentes();
	}
}
