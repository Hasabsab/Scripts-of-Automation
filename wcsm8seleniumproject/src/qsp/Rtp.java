package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
	System.out.println("select the browser which u want to open!");
	String browserValue = sc.next();
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	else if(browserValue.equalsIgnoreCase("Firefox"))
	{
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	else
	{
		System.out.println("Select the valid browserValue");
	}
	}

}
