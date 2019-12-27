package utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.InstanciaDrivers;

public class ComandosSelenium {

	public TestName testName = new TestName();
	
	public void AbrirSite(String site) {
		InstanciaDrivers.getDriver().get(site);
	}

	public void printScreen() throws IOException {
//
//		TakesScreenshot ss = (TakesScreenshot) InstanciaDrivers.getDriver();
//		File arquivo = ss.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(arquivo,"target");

	}
}
