package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		//driver.quit();
		
		
		

	}

}
