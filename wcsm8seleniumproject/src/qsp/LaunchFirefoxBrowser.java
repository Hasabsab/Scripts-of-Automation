package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		// to launch Firefoxbrowser
      System.setProperty("Webdriver.gecko.driver","./drivers/geckodriver.exe");
      //FirefoxOptions fo = new FirefoxOptions();
      //fo.addArguments("--remote-allow-origins=*");
      new FirefoxDriver(); 
	}

}
