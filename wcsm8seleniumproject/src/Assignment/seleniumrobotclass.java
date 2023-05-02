package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class seleniumrobotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//body[@class='td-home']"));

		Actions act = new Actions(driver);
		act.contextClick(target).perform(); 
		Thread.sleep(2000);
		Robot robot = new Robot(); 

		for(int i=0;i<=9;i++)
		{
			Thread.sleep(2000);	
			robot.keyPress(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);


	}

}
