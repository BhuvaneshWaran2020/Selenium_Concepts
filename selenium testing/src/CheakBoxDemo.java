import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheakBoxDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		
		
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[4]/input"));
		checkbox1.click();
		
		WebElement checkbox2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		boolean status=checkbox2.isSelected();
		System.out.println(status);
		
		
		WebElement checkbox3=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		if(checkbox3.isSelected())
		{
			checkbox3.click();
		}
		WebElement checkbox4=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		if(checkbox4.isSelected())
		{
			checkbox4.click();
		}
	}
}
