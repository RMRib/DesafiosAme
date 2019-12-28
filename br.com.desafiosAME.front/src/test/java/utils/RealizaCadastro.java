package utils;

import java.time.Duration;
import java.util.UUID;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.InstanciaDrivers;

//classe apenas paga geração de cadastro válido
public class RealizaCadastro {

	static WebDriverWait wait = new WebDriverWait(InstanciaDrivers.getDriver(), Duration.ofSeconds(10));
	
	public static String geraLogin(String password) throws InterruptedException {

		String uuid = UUID.randomUUID().toString();

		WebDriver driver = InstanciaDrivers.getDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
		driver.findElement(By.id("email_create")).click();
		driver.findElement(By.id("email_create")).clear();
		driver.findElement(By.id("email_create")).sendKeys(uuid + "@teste.com");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email address'])[1]/following::span[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("uniform-id_gender1")));
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).click();
		driver.findElement(By.id("customer_firstname")).clear();
		driver.findElement(By.id("customer_firstname")).sendKeys("firstname");
		driver.findElement(By.id("customer_lastname")).click();
		driver.findElement(By.id("customer_lastname")).clear();
		driver.findElement(By.id("customer_lastname")).sendKeys("lastname");
		driver.findElement(By.id("passwd")).click();
		driver.findElement(By.id("passwd")).clear();
		driver.findElement(By.id("passwd")).sendKeys(password);
		new Select(driver.findElement(By.id("days"))).selectByIndex(1);
		new Select(driver.findElement(By.id("months"))).selectByIndex(1);
		new Select(driver.findElement(By.id("years"))).selectByIndex(1);
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("address1")).click();
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys("test st, test");
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("test city");
		driver.findElement(By.id("id_state")).click();
		new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("California");
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("postcode")).click();
		driver.findElement(By.id("postcode")).clear();
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone_mobile")).click();
		driver.findElement(By.id("phone_mobile")).clear();
		driver.findElement(By.id("phone_mobile")).sendKeys("5511123412341");
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='DNI / NIF / NIE'])[1]/following::span[1]"))
				.click();
		driver.findElement(By.linkText("Sign out")).click();
		return uuid + "@teste.com";
	}


}
