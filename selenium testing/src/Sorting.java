

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement dropbox1=driver.findElement(By.id("animals"));
		Select select=new Select(dropbox1);
		List<WebElement> listofitems=select.getOptions();
		
		List<String> original=new ArrayList<String>();
		List<String> temp=new ArrayList<String>();
		
		for (WebElement bhuvi : listofitems) {
			
			original.add(bhuvi.getText());
			temp.add(bhuvi.getText());
		}
		System.out.println("before sorting original"+original);
		System.out.println("before sorting temp"+temp);
		
		Collections.sort(temp);
		System.out.println("after sorting temp"+temp);
		
		if(original==temp)
		{
			System.out.println("is it sorted");
		}
		else
		{
			System.out.println("is it not sorted");
		}
	}

}
