import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.plaf.synth.SynthStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("facebook.com");
		Robot ro=new Robot();
		
		ro.keyPress(KeyEvent.VK_ENTER);
		
		Set<Cookie> cookie=driver.manage().getCookies();
		 int size=cookie.size();
		 for (Cookie cookie2 : cookie)
		 {
			 String cookie12 =cookie2.getName();
			 String cookie13= cookie2.getValue();
			 System.out.println("name"+cookie12+"value"+cookie13);
		}
		
		 Cookie coo=new Cookie("mycookie","123457");
		
		 driver.manage().addCookie(coo);
		 int size1=cookie.size();
		 for (Cookie cookie2 : cookie) {
			 String cookie12 =cookie2.getName();
			 String cookie13= cookie2.getValue();
			 System.out.println("name"+cookie12+"value"+cookie13);
			
		}
		

	}

}
