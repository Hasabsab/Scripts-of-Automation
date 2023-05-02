package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/tshirts-men/pl/3k8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//p[class='sc-dkrFOg bNTHrS']")).click();
		
		

	}

}
