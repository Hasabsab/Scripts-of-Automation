package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitimewithexplicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.river","./drivers.chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-jdejejo6/login.do");
		if(driver.getTitle().equals("actiTIME - Login"))
		{
		  System.out.println("Login page Title is matched,Test is case is passed!");	
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		  
		 
		}
		else
		{
			System.out.println("Login page Title is not matched,Test is case is failed!");
			
		}
		
		
	}

}
