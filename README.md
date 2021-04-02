# Desafio Tallos Automação
 
Este é um Projeto Maven e foi criado conforme requisito abaixo, utilizando os seguintes recursos:
<!--ts-->
   * Java
   * Maven
   * JUnit
   * Selenium
   * Cucumber
   * Padrão PageObjects
   * Pluguins p/ relatórios automatizados no Jenkins
   * IDE: Eclipse 2020-12
<!--te-->

##### Avisos Importantes:

Os teste foram validados no Google Chrome e Mozilla Firefox, e eu utilizei o WebDriver nas Variáveis de Ambiente do meu sistema. Caso você não possua o mesmo setup, eu disponibilizei as versões mais recentes do ChromeDriver e GeckoDriver para Windows dentro do projeto:

```
/src/test/resources/webdrivers/
```
Para utiliza-las localmente no projeto, remova as tags de comentário nas linhas 23 e 24 da classe:
```
/src/main/java/support/BrowserFactory.java
```
E para alternar entre os navegadores, substitua na mesma classe o Browser Default na linha 18.

<!--ts-->
   * CHROME
   * CHROME_HEADLESS
   * FIREFOX
   * FIREFOX_HEADLESS
<!--te-->

### Planejamento dos Testes
Mapeando Cenários de Teste

_Funcionalidade: _

* Cenário: 
* Cenário: 
* Cenário: 
* Cenário:
 
_Funcionalidade: _

* Cenário: 
* Cenário: 
* Cenário: 
* Cenário: 

###### Criando as Features de Teste
Tendo em mãos os Cenários de cada fluxos de teste (fluxo base e alternativos), comecei a escrita das features em ***gherkin*** tendo como base o ***BDD***:

```
/src/test/resources/features/.feature
```
```
/src/test/resources/features/.feature
```
### Setup da IDE e Projeto de Automação
###### Criar Projeto no Eclipse
* File > New > Maven Project
###### Instalação de plugin na IDE
* Help > Eclipse Marketplace > [Cucumber Eclipse Plugin](http://marketplace.eclipse.org/content/cucumber-eclipse-plugin)
###### Instalar pacotes na Aplicação via Maven (pom.xml)
* cucumber-java 1.2.5
* cucumber-junit 1.2.5
* selenium-java 3.141.59

###### pom.xml

```
<dependencies>
	<dependency>
		<groupId>info.cukes</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>1.2.5</version>
	</dependency>
	<dependency>
		<groupId>info.cukes</groupId>
		<artifactId>cucumber-junit</artifactId>
		<version>1.2.5</version>
		<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>3.141.59</version>
	</dependency>
</dependencies>
```

