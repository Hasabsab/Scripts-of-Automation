package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo123 {
	public static void main(String[] args) throws InterruptedException {
		
		// to avoid illegal state exception
        System.setProperty("WebDriver.Chrome.driver","./drivers/Chromedriver.exe");
		
        //to avoid connectionFailedexception
        ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//to launch chrome Browser
		WebDriver driver = new ChromeDriver(co);
		
		//to maximise Browser
		driver.manage().window().maximize();
		
		 //to stop the execution of script for 2 seconds
		Thread.sleep(2000);
		
		//to close the browser
		driver.close();
	}

}
