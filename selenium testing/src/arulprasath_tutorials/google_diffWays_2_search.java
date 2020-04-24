package arulprasath_tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class google_diffWays_2_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		driver.findElement(By.name("q")).sendKeys("abhi \n");
		
		driver.switchTo().activeElement().sendKeys("tiruppur \n");
		
		/*PageFactory.initElements(driver, google_diffWays_2_search.class);
		WebElement q;
		q.sendKeys("tiruppur \n");*/
		
	}

}
