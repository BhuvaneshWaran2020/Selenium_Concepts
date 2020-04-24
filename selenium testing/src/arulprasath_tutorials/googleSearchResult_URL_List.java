package arulprasath_tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchResult_URL_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		driver.findElement(By.name("q")).sendKeys("abhi \n");
		
		driver.findElements(By.tagName(""));
		
		
		

	}

}
