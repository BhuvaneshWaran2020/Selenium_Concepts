

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement downloadfile=driver.findElement(By.xpath("//*[@id='wrapper']/div/div[3]/div[2]/a[1]"));
		downloadfile.click();
		
		File filelocation=new File("C:\\Users\\gtech\\Downloads");
		
		File[]listoffiles=filelocation.listFiles();
		
		for (File file : listoffiles) {
			if(file.getName().equals("download.xls")){
				System.out.println("downloding file is theare");
				break;
			}
			
			
		}
		
	}

}
