import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actions12 {
	
	@Test

	void m1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		
		WebElement admin=driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
		WebElement usermanage=driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		WebElement user=driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(admin).build().perform();
		act.moveToElement(usermanage).build().perform();
		act.moveToElement(user).click().build().perform();
	}

}
