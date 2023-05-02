package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in");
		driver.findElement(By.xpath("//a[contains(text(),' Login/Enrol')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("hasanyargatti190@gmai.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hasan@123");
		driver.findElement(By.xpath("//button[@id='next']")).click();
	}

}
