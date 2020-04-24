import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sortable2demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		//Window maximize coding
		driver.manage().window().maximize();
		
		//finding a Element 
		WebElement sorting=driver.findElement(By.id("animals"));
		//Creating object to access the dropdownbox
		Select se=new Select(sorting);
		//collecting a dropdownbox items
		List<WebElement> options =se.getOptions();
		//creating a temp &original string a listbox
		List<String> originalList=new ArrayList<String>();
		List<String> temp=new ArrayList<String>();
		///using a for loop to print the dropbox items 
		for (WebElement bhuvi : options) {
			originalList.add(bhuvi.getText());
			temp.add(bhuvi.getText());
		}
		 System.out.println("before sorting originallist : "+originalList);
		 System.out.println("before sorting temp originallist : "+temp);
		 
		
		 Collections.sort(temp);
		 System.out.println("after sorting "+temp);
		 
		 
		 

	}

}
