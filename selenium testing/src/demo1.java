import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		d.findElement(By.name("q")).sendKeys("cricket"+Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.className("LC20lb")).click();
		d.findElement(By.linkText("Scorecard")).click();

		// d.quit();
	
           	
	}

}
