package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edgemobile {

	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
        EdgeOptions eo = new EdgeOptions();
        eo.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(eo); 

	}

}
