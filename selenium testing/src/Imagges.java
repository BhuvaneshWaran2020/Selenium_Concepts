import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagges {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		///WebElement images=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		//images.click();
		
		
		WebElement images2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if(images2.getAttribute("naturalWidth").equals("0")){
			System.out.println("image was broken");}
			else{
				System.out.println("image was not broken");
				
			}
		}
	}


