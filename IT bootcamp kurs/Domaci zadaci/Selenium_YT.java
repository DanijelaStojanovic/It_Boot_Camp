import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_4_0228 {

	public static void main(String[] args) {
		// // Pomocu jave i seleniuma otvoriti pretrazivac i otici na Youtube. Pet puta
		// kliknuti na dugme refresh, i tek onda zatvoriti pretrazivac.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jovica\\Desktop\\LELA\\JAVA\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.get("https:\\youtube.com");

		for (int i = 0; i < 5; i++) {
			wd.navigate().refresh();
		}
		wd.close();
	}

}
