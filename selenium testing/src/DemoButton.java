

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		WebElement homebutton=	driver.findElement(By.id("home"));
		homebutton.click();
		driver.navigate().back();
		driver.navigate().refresh();

		WebElement getPositionButton= driver.findElement(By.id("position"));
		Point xypoint = getPositionButton.getLocation();
		int xvalue =xypoint.getX();
		int yvalue =xypoint.getY();
		System.out.println("print x value="+xvalue+"print y value"+yvalue);

		WebElement color =driver.findElement(By.id("color"));
		String color1= color.getCssValue("background-color");
		System.out.println("the css value is :"+color1);


		WebElement size= driver.findElement(By.id("size"));
		int height =size.getSize().getHeight();
		int width= size.getSize().getWidth();
		System.out.println("height is :"+height+"width is :"+width);


	}

}
