package arulprasath_tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("m.bhuvanesh777@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("bhuvi3411110795");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	0s,0.5s,1.0s,1.5s.., polling
		driver.findElement(By.id("loginbutton")).click();
		
		

	}

}
