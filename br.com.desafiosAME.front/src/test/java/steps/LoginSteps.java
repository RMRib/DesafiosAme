package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import utils.InstanciaDrivers;
import utils.Configs;

public class LoginSteps extends LoginPage{
	
	static WebDriver driver;
		
	@After
	public void tearDown() {
		InstanciaDrivers.finalizaDriver();
	}

	@Dado("^que eu acessei o site da loja$")
	public void que_eu_acessei_o_site_da_loja() throws Throwable {
		AbrirSite("http://automationpractice.com/index.php");
	}

	@Dado("^cliquei em Sign in$")
	public void cliquei_em_Sign_In() throws Throwable {
		clicarLinkSignin();
	}

	@Quando("^eu preencher o campo Email address com \"([^\"]*)\"$")
	public void eu_preencher_o_campo_Email_address_com(String arg1) throws Throwable {
		preencherEmail(arg1);
	}

	@Quando("^preencher o campo Password com \"([^\"]*)\"$")
	public void preencher_o_campo_Password_com(String arg1) throws Throwable {
		preencherPassword(arg1);
	}

	@Quando("^clicar no botão Sign in$")
	public void clicar_no_botão_Sign_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clicarBotaoSignin();
	}

	@Então("^o acesso ao site é concedido$")
	public void o_acesso_ao_site_é_concedido() throws Throwable {
	   	Assert.assertEquals("MY ACCOUNT", obterTitulo());
	}

	@Então("^a página \"([^\"]*)\" é exibida$")
	public void a_página_é_exibida(String arg1) throws Throwable {
		Assert.assertEquals(arg1, obterTitulo());
		}

	@Então("^o acesso a conta é negado$")
	public void o_acesso_ao_site_é_negado() throws Throwable {
	    Assert.assertEquals("There is 1 error", obterErro());
	}

	@Então("^a mensagem \"([^\"]*)\" é exibida$")
	public void a_mensagem_é_exibida(String arg1) throws Throwable {
	    Assert.assertEquals(arg1, obterMensagemErro());;
	}
}
