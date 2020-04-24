package arulprasath_tutorials;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_Refresh {

	public static void main(String[] args) throws AWTException {
		/*refresh:
			1).normal refresh
			2).getcurrentUrl
			3).Robot.class..f5
			4).javascript executor*/
			
			
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// normal refresh
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
		
		// getcurrenturl
		driver.get(driver.getCurrentUrl());
		
		//robot ..,f5
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		//javascript executor
		
		JavascriptExecutor java=(JavascriptExecutor) driver;
		java.executeScript("Location.reload()");
		
		

	}

}
