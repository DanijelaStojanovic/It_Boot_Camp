package selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0227 {

	public static void main(String[] args) {
		// Otvoriti novi prozor u pretrazivacu i otici na IT Bootcamp
		// 2) Primeniti metode koje smo vezbali na casu (get URL i Title, navigate -
		// refresh, to, back, forward)
		// 3) U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na
		// prvobitnu velicinu
		// (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )
		// Dodatni neobavezni zadatak: Nadji metodu kojom ces vratiti duzinu “naslova”,
		// ne samo naslov.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jovica\\Desktop\\LELA\\JAVA\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.get("https:\\itbootcamp.rs");
		
		Dimension velicina= wd.manage().window().getSize();
		
		wd.manage().window().maximize();
		
		
		String naslov= wd.getTitle();
		System.out.println("Naslov trenutne stranice je:" + naslov);
		
		int duzina = wd.getTitle().length();
		System.out.println("Duzina naslova je: " + duzina + "karaktera");
		
		wd.navigate().refresh();
		wd.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");
		
		String url=wd.getCurrentUrl();
		System.out.println("Url trenutne stranice je: " + url);
		
		wd.navigate().back();
		wd.manage().window().setSize(velicina);
		
		wd.navigate().forward();
		wd.close();
	}

}
