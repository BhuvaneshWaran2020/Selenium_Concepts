

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// Browser open
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		
		//Click Button To Access The button
		WebElement gotohomebutton =driver.findElement(By.id("home"));
		gotohomebutton.click();
		
		//back contol using automation
		driver.navigate().back();
		
		// Get Position Of The Button
		
		WebElement getpositionbutton=driver.findElement(By.id("position"));
		Point xypoint=getpositionbutton.getLocation();
		int xvalue = xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("x value is :"+xvalue+"yvalue is :"+yvalue);
		
		//Find The Color of the BUtton
		
		WebElement colorbutton=driver.findElement(By.id("color"));
		String csscolor=colorbutton.getCssValue("background-color");
		System.out.println("color is ;"+csscolor);
		
		//Find he Size Of The Button
		
		WebElement sizebutton=driver.findElement(By.id("size"));
		int height=sizebutton.getSize().getHeight();
		int width=sizebutton.getSize().getWidth();
		System.out.println("height is :"+height+ "width is:"+width);
		
		
		// close the window
		
		driver.quit();

	}

}
