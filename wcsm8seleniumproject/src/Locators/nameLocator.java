package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class nameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin?_gl=1*14z4g85*_ga*MTEyMzM0MTcxMy4xNjgwMTUyMDc5*_ga_XT2HK8QEM5*MTY4MDE1MjA4NS4xLjAuMTY4MDE1MjA4NS42MC4wLjA.&_ga=2.141474546.1198510890.1680152079-1123341713.1680152079");
		Thread.sleep(2000);
		driver.findElement(By.name("emailId")).sendKeys("hasanyaragatti190@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Hasan@123");
		Thread.sleep(2000);
		driver.findElement(By.className("primary-btn")).click();
	}

}
