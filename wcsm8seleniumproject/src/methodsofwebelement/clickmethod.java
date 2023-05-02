package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class clickmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//span[text()='Phone number, username, or email']")).sendKeys("hasanyaragatti");
		
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("Hasan123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();

	}

}
