import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/radio.html");


		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]"));
		WebElement radiobutton2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		boolean radio2=radiobutton2.isSelected();

		boolean radio1 = radiobutton1.isSelected();

		System.out.println(radio1);
		System.out.println(radio2);





	}

}
