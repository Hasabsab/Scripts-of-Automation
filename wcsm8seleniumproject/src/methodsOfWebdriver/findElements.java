package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		    WebDriver  driver=new ChromeDriver(co);
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
		 List<WebElement> laptopOptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
			Thread.sleep(2000);
		List<WebElement> laptopName =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		    for(int i=1;i<laptopOptions.size();i++)
		    {
		    	String laptop1 = laptopName.get(i).getText();
		    	System.out.print(laptop1);
		    	Thread.sleep(2000);
		    	
		    	String laptop = laptopOptions.get(i).getText();
		    	System.out.println(laptop);
		    	Thread.sleep(2000);
		    	
		    }
			

	}

}
