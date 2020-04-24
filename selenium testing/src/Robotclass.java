import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadpdf=driver.findElement(By.linkText("Download PDF"));
		downloadpdf.click();
		Robot clk=new Robot();
		
		clk.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		clk.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		clk.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		clk.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		clk.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		clk.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		clk.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		clk.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		

	}

}
