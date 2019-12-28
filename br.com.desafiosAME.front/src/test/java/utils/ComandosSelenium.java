package utils;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import utils.InstanciaDrivers;


public class ComandosSelenium {
	 
	private int testNumber =1;
	
	public void AbrirSite(String site) {
		InstanciaDrivers.getDriver().get(site);
	}

	public void printScreen() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)InstanciaDrivers.getDriver();
		File arquivo = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(arquivo, new File
				("target" + 
				File.separator + "surefire-reports" + 
				File.separator + testNumber + ".jpg"));
		
		testNumber++;
		//melhorar para salvar com o nome da feature + nome do step
	}
}
