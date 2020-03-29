package Domaci_Selenium_test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0316 {

	public static void main(String[] args) {
		// Napraviti testNG klasu koja ce testirati da li se zeljena web stranica
		// otvorila. Proveru izvrsiti na osnovu Title-a.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jovica\\Desktop\\LELA\\UvodUSelenium\\src\\predavanja\\SeleniumUvod\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		wd.get("https://covid19.rs/");

		wd.manage().window().maximize();

		String naslov = wd.getTitle();
		System.out.println("Naslov trenutne stranice je:" + naslov);
		wd.close();
	}

}