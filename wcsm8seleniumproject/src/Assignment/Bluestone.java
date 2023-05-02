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

public class Bluestone {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery '] "));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[text()='Band'] ")).click();
		
		WebElement target2 = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		
		act.doubleClick(target2).perform();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.xpath("//input[@name='search_query']")).click();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_V);

	}

}
