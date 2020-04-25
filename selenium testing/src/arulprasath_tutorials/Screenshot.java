package arulprasath_tutorials;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BhuvaneshWaran\\Downloads\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		
		String s ="screenshotname";
		
	//	Normal using selenium
		/*TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		
		File Destinationfile=new File("D:\\selenium\\"+s+".png"); // (or)
*/		
		/*String dest=System.getProperty("user.dir")+"/errorscreenshot/"+s+".png";*/
		
		/*File Destinationfile=new File(dest);*/
		
		/*FileHandler.copy(source, Destinationfile); // or we use FileUtils.(Commons.io)
	*/
		
		Robot robot=new Robot();
		
		Dimension size=	Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rec=new Rectangle(size);
		
		
		BufferedImage source=robot.createScreenCapture(rec);
		
		File destinationFile=new File("D://sample1.png");
		
		ImageIO.write(source, "png", destinationFile);
		
		
		
		
		
		
		
		

	}

}
