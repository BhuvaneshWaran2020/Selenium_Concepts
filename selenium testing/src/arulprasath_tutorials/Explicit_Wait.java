package arulprasath_tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_Wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("m.bhuvanesh777@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("bhuvi3411110795");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement click=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton"))); 
		click.click();
		
		
	}
	
}
