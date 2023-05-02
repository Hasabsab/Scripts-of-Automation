package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9301536%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwiZqhBhCJARIsACHHEH8RRfjp8OIB8Z9WKB2KQ9X6Z-xUxIHGLnzZpkMb_PS_9XByOLiFtDgaAl-9EALw_wcB");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("pqn");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12330");
		driver.findElement(By.id("month")).click();
		driver.findElement(By.id("year")).click();
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
	}

}
