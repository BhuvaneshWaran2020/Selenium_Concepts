import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/resizable/");
		
		WebElement resizhable=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(resizhable).dragAndDropBy(resizhable, 100, 100).build().perform();

	}

}
