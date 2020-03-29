
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
public class Zadatak_2_0309 {
	
	public static void main(String args[]) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jovica\\Desktop\\LELA\\UvodUSelenium\\src\\predavanja\\SeleniumUvod\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/mamnjam/?hl=en");
		
		TakesScreenshot src = ((TakesScreenshot) driver);
	
		File sr = src.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\Jovica\\Desktop\\LELA\\UvodUSelenium\\src\\Screenshot.png");
			
		FileUtils.copyFile(sr, destFile);
			
		
		driver.manage().window().setPosition(new Point(0, -2000));
		driver.close();
	}
}