package arulprasath_tutorials;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_page {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		 driver.findElement(By.name("q")).sendKeys("abhi \n");
		
		// Using Robot Class
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		*/

		// Using JavaScriipt Executor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		/*js.executeScript("window.scroll(0,400)","");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-400)","");
		*/
		
		// scroll to bottom of page
		/*js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)","");
		*/
		
		// scroll to specific position
		WebElement link = driver.findElement(By.partialLinkText("Kumkum Bhagya: Abhi and Pragya"));
		js.executeScript("arguments[0].scrollIntoView(true)", link);
		
		
		
		
		
		
	}

}
