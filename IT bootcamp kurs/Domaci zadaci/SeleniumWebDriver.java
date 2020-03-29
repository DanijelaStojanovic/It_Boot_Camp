package selenium_domaci;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_1_0326 {

	public static void main(String[] args) {
		// Koristeci Selenium webdriver otici na sajt
		// https://www.techlistic.com/p/selenium-practice-form.html
		// i popuniti formu (idealno celu, ako ne ide onda probajte bar do kontinenta)
		// Potrudite se da koristite vise lokatora za pronalazenje elemenata.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bb\\Desktop\\Lela it boot camp\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		// ime
		WebElement ime = driver.findElement(By.name("firstname"));
		ime.click();
		ime.sendKeys("Lela");
		
		// prezime
		WebElement prezime = driver.findElement(By.cssSelector("input[name=lastname]"));
		prezime.click();
		prezime.sendKeys("Stojanovic");
		
		// pol/radio button
		driver.findElement(By.id("sex-1")).click();
		
		// godine iskustva/ radio button
		driver.findElement(By.id("exp-1")).click();
		
		// datum
		WebElement datum = driver.findElement(By.id("datepicker"));
		datum.click();
		datum.sendKeys("27.03.2020.");
		
		// profesija/checkbox
		driver.findElement(By.id("profession-0")).click();
		WebElement profesija = driver.findElement(By.id("profession-1"));
		profesija.click();
		
		// alati/checkbox
		driver.findElement(By.id("tool-2")).click();
		
		// kontinent/dropdown list
		Select continents = new Select(driver.findElement(By.id("continents")));
		continents.selectByVisibleText("Europe");
		
		// Selenium komande/multiple select
		Select komande = new Select(driver.findElement(By.id("selenium_commands")));
		komande.selectByVisibleText("Browser Commands");
		komande.selectByVisibleText("Navigation Commands");
		komande.selectByVisibleText("WebElement Commands");

		// Upload image
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\bb\\Downloads\\MamNjam.jpg");
		
		// Download file
		driver.findElement(By.partialLinkText("Download")).click();
		driver.findElement(By.xpath("//a[@class='link-gray']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-outline float-right']")).click();
		driver.findElement(By.xpath("//summary[@class='btn btn-sm ml-2 btn-primary']")).click();
		driver.findElement(By.xpath("//a[@class='flex-1 btn btn-outline get-repo-btn js-anon-download-zip-link']")).click();
		
		for(int i=0; i<3; i++) {
			driver.navigate().back();
		}
		WebDriverWait wait=new WebDriverWait(driver,3);
		WebElement elem=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
		driver.findElement(By.name("submit")).click();
		
		driver.close();
}
	}


