package methodsOfWebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setpositionmethod {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
     ChromeOptions co=new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     WebDriver driver=new ChromeDriver(co);
     driver.manage().window().maximize();
      Point targetposition = new Point(450,350);
     Thread.sleep(2000);
     driver.manage().window().setPosition(targetposition);

	}

}
