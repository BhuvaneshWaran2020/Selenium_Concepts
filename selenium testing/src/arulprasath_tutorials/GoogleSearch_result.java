package arulprasath_tutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_result {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		driver.findElement(By.name("q")).sendKeys("abhi");
		Thread.sleep(2000);
		List<WebElement> abhi=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
	
		for (WebElement webElement : abhi) {
			System.out.println(webElement.getText());	
			
		}
	}

}
