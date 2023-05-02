package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		Thread.sleep(2000);
		driver.findElement(By.name("actiTimeUrl")).sendKeys("xerbia hinjewadi");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Hasan");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Hasan@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();

	}

}
