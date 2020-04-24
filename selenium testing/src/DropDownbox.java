

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");

		//Selecting DropDownBox Using SelectByindex

		WebElement dropbox1=driver.findElement(By.id("dropdown1"));
		Select bhuvi=new Select(dropbox1);
		bhuvi.selectByIndex(2);

		//Selecting DropDownBox Using SelectBytext

		WebElement dropbox2=driver.findElement(By.name("dropdown2"));
		Select bhuvi2=new Select(dropbox2);
		bhuvi2.selectByVisibleText("Selenium");

		//Selecting DropDownBox Using SelectByvalue

		WebElement dropbox3=driver.findElement(By.id("dropdown3"));
		Select bhuvi3=new Select(dropbox3);
		bhuvi3.selectByValue("3");
 
		//Get size of dropdownbox

		WebElement dropbox4=driver.findElement(By.className("dropdown"));
		Select bhuvi4=new Select(dropbox4) ;
		List<WebElement> listofoptions= bhuvi4.getOptions();
		int size=  listofoptions.size();
		System.out.println("get size of dropdownbox : "+size);
		
		//send sendkeys to access the dropbox
		
		WebElement dropbox5=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		dropbox5.sendKeys("Selenium");
		
		//select all the elements
		
		WebElement dropbox6=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select bhuvi6=new Select(dropbox6);
		bhuvi6.selectByIndex(1);
		bhuvi6.selectByIndex(2);
		bhuvi6.selectByIndex(3);
		
		
		
		
		
	}




	}
