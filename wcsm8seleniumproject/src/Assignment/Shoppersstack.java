package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		  WebDriver driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  driver.get("https://www.shoppersstack.com/");
		  
		  driver.findElement(By.xpath("//span[text()='NOSIE']")).click();
		  
		  driver.findElement(By.id("Check Delivery")).sendKeys("591307");
		  
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	      
	      WebElement checkbuton = driver.findElement(By.id("Check"));
	      
	      wait.until(ExpectedConditions.elementToBeClickable(checkbuton)).click();

	}

}
