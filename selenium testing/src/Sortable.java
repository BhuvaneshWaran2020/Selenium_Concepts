import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> sortable=driver.findElements(By.xpath("//*[@id='sortable']/li"));
		int size=sortable.size();
		System.out.println(size);
		
		//last to first first step
		
		WebElement from=sortable.get(6);
		WebElement to=sortable.get(0);
		
		Actions actions=new Actions(driver);
		
		actions.clickAndHold(from).moveToElement(to).release().build().perform();
		
	}

}
