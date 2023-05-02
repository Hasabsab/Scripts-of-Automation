package Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hotstar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("hotstar.com/login",Keys.ENTER);
		Thread.sleep(2000);

	}

}
