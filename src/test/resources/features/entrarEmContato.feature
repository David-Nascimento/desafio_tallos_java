#language: pt
Funcionalidade: Entre em contato
	Eu como usuario da pagina do Vitrine Social
	Quero ter acesso a tela de entrar em contato 
	para enviar alguma sugestao
		
		@EntrarEmContato
	Cenario: Envia uma sugestao com sucesso
		Dado que eu acesse a pagina Vitrine Social
		Quando eu estiver na pagina de Contato
		E preencher o formulario
		Entao devo enviar o formulario para o contato da vitrine social