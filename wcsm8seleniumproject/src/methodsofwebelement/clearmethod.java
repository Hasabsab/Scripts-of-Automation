package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class clearmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-aigvo6j/login.do");
		
		WebElement usernameTB = driver.findElement(By.name("username"));
		
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		
		usernameTB.sendKeys("admin");
		
		passwordTB.sendKeys("manager");
		
		Thread.sleep(2000);	
		
		usernameTB.clear();
		Thread.sleep(2000);	
		passwordTB.clear();
		Thread.sleep(2000);	
		

	}

}