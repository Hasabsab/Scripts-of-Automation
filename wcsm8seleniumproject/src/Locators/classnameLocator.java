package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classnameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("JAVA PROGRAMMING",Keys.ENTER);
		Thread.sleep(2000);
		

	}

}
