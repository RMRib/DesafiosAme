package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstanciaDrivers {
	
private static WebDriver driver;
	
	private InstanciaDrivers() {}
	
	public static WebDriver getDriver(){
		
		String driverpath = "/home/ricardo/Desktop/desafios AME/DesafiosAme/br.com.desafiosAME.front/src/test/resources/drivers/";

		switch(Configs.so) {
		case linux:
			System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver_linux");
		break;
		case macos:
			System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver_mac");
		break;
		case win32:
			System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver_win32");
		break;
		}
		
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();		
		}
		return driver;
	}

	public static void finalizaDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		} 
	}
}
