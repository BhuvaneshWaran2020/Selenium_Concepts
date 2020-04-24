import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_tables {

	public static void main(String[] args) {
	
		/*System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
        
		List<WebElement> column =driver.findElements(By.tagName("th"));
		int totalColumn =column.size();
		System.out.println("Total column present is: "+totalColumn);
		

		List<WebElement> row =driver.findElements(By.tagName("tr"));
        int rowCount = row.size();
        System.out.println("Total row present in table : "+rowCount);
        
        WebElement s= driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[1]"));
        String totol= s.getText();
        System.out.println(totol);
        
        
        
        
        
        
        
        
        */
        
        // To select any percent and click
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
	     
	     List<WebElement> Select = driver.findElements(By.xpath("//td[2]"));
	     
	     List<Integer> PercentageList = new ArrayList<Integer>();
	     
	     for (WebElement webElement : Select) {
	    	 String individualValue = webElement.getText().replace("%", "");
	    	 PercentageList.add(Integer.parseInt(individualValue));
	    	 		
		}

	     System.out.println("finalList is :"+PercentageList);
	     
	    int smallvalue= Collections.min(PercentageList);
	    
	   String Smallvaluestring= Integer.toString(smallvalue)+"%";
	   
	   System.out.println(Smallvaluestring);
	   
	   String s1="//td[normalize-space()="+"\""+Smallvaluestring+ "\""+"]"+"//following::td";
	   
	   
	 //  System.out.println(s1);
	    
	   WebElement ddhgddrh=driver.findElement(By.xpath(s1));
	   ddhgddrh.click();
	   
	   
	
	}
        

        
        
	}
		
		
		
		
		
		
	



