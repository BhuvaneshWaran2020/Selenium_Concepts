import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		//drag and drop method 
		//first we need to find a element
		
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		//creating a action object...
		Actions actions=new Actions(driver);
		//drag and drop first method
		//actions.clickAndHold(from).moveToElement(to).release().build().perform();
		
		//another method
		
		actions.dragAndDrop(from, to).build().perform();
	}

}
