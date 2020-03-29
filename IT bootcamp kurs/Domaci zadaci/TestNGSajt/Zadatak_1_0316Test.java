package Domaci_Selenium_test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Zadatak_1_0316Test {

	@Test
	public void TestWebPage() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jovica\\Desktop\\LELA\\UvodUSelenium\\src\\predavanja\\SeleniumUvod\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://covid19.rs/");

		Assert.assertEquals(wd.getTitle(), "COVID-19");

	}
}
