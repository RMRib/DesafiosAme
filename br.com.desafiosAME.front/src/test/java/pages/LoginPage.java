package pages;

import utils.ComandosSelenium;
import utils.InstanciaDrivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage extends ComandosSelenium{
	
	WebDriverWait wait = new WebDriverWait(InstanciaDrivers.getDriver(), Duration.ofSeconds(10));

	
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
		InstanciaDrivers.getDriver().findElement(By.id("email")).sendKeys(email);
	}
	
	public void preencherPassword(String password) {
		InstanciaDrivers.getDriver().findElement(By.id("passwd")).sendKeys(password);
	}
	
	public void clicarBotaoSignin() {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
		InstanciaDrivers.getDriver().findElement(By.id("SubmitLogin")).click();
	}
	
	public void clicarLinkSignin() {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
		InstanciaDrivers.getDriver().findElement(By.linkText("Sign in")).click();
	}

	public String obterTextoPorID(String id) {
		String texto = InstanciaDrivers.getDriver().findElement(By.id(id)).getText();
		return texto;
	}
	public String obterTitulo() {
		String titulo = InstanciaDrivers.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1")).getText();
		return titulo;
	}
	public String obterErro() {
		String erro = InstanciaDrivers.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p")).getText();
		return erro;
	}
	
	public String obterMensagemErro() {
		String mensagemErro = InstanciaDrivers.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
		return mensagemErro;
	}
	
}
