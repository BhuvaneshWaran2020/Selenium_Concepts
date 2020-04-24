package arulprasath_tutorials;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Different_maximize {

	public static void main(String[] args) {
		
		/*
		maximize:
			
			1).normal
			2).Dimension --->selenium
			3).chromeoptions---->class selenium
		
	//	1).normal
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	// 2)dimention:
		
		Dimension dimention =new Dimension(1366, 768);
		driver.manage().window().setSize(dimention);
		*/
	//	3)ChromeOptions:
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeOptions maxi=new ChromeOptions();
		maxi.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(maxi);
		driver.get("https://www.facebook.com/");
		
		
		
		
		

	}

}
