import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleartDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		
		WebElement box1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		box1.click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		
		WebElement box2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		box2.click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		
		WebElement box3=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		box3.click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("bhuvanesh waran");
		alert3.accept();
		
		
		
		
		
	}

}
