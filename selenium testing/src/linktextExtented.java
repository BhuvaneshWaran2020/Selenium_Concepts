import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextExtented {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement link1=driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		
		driver.navigate().back();
		
		WebElement link2=driver.findElement(By.partialLinkText("Find where am supposed "));
		 String findlink=link2.getAttribute("href");
		 System.out.println(findlink);
		 
		 WebElement link3=driver.findElement(By.linkText("Verify am I broken?"));
		 link3.click();
		 String value= driver.getTitle();
		 if(value.contains("404")){
			 System.out.println("link was broken");
		 }
		 
		 driver.navigate().back();
		 
		 WebElement link4=driver.findElement(By.linkText("Go to Home Page"));
			link4.click();
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
