import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditboxTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe"); 
		WebDriver bhuvanesh=new ChromeDriver();
	bhuvanesh.get("https://www.google.com");
	bhuvanesh.findElement(By.name("q")).sendKeys("www.leafground.com"+Keys.ENTER);
	WebElement editboxclick = bhuvanesh.findElement(By.className("LC20lb"));
	editboxclick.click();
	//bhuvanesh.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img")).click();
	//bhuvanesh.findElement(By.id("email")).sendKeys("m.bhuvanesh777@gmail.com");
	//bhuvanesh.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"))
	//.sendKeys("hello");
	//bhuvanesh.findElement(By.name("username")).sendKeys("bhuvi");
	//bhuvanesh.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")).clear();
	//bhuvanesh.quit();
	
	
	

	}

}
