package Banka_TestNG;

import java.text.Format;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AccountTest {
// Potrebno je napraviti test za ispravnost klase Account. Ako se na osnovu testova pronadje neka greska u kodu potrebno je da se popravi originalnin kod.
//a)Proveriti da li konstruktor public Account(String name, String number) dobro postavlja argumente, kao i da li get metode vracaju odgovarajuce vrednosti. 
// Kada se napravi racun, stanje treba da bude jednako 0.
//b)Proveriti da li set metode dobro postavljaju odgovarajuce vrednosti, kao i da li get metode vracaju odgovarajuce vrednosti.
//c)Proveriti da li je ispravan format ispisa jednog Account-a. Ocekivani format ispisa: broj<tab>ime<tab>stanje. Stanje treba da bude zaokruženo na dve decimale.
//d)Napraviti 100 000 naloga pomocu konstruktora public Account(String name) i proveriti da li se svi brojevi razlikuju.

	@BeforeClass

	public void TestConstructor() {
		String ime = "Lela";
		String broj = "12345";
		Account racun = new Account(ime, broj);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(racun.getName(), "Lela");
		// sa.assertEquals(racun.getName(), ime); ///moze i ovako, tj ime nase
		// promenljive
		sa.assertEquals(racun.getNumber(), "12345");
		// sa.assertEquals(racun.getNumber(), broj); // moze i ovako, tj ime promeljive
		sa.assertEquals(racun.getAmount(), 0d);// fail
		// ocekivao je 0, a vratio 1, bug u klasi
		// greske mogu biti u konstruktoru, ali i u svim ostalim
		// metodama koje se koriste u testu, npr getName

		racun.setAmount(25000.0);
		sa.assertEquals(racun.getAmount(), 25000.0);
		sa.assertAll();

	}

	@Test
	public void AccountTestString() {

		Account racuni[] = new Account[100];
		for (int i = 0; i < racuni.length; i++) {// ovde moze i length -1

			racuni[i] = new Account("Lela");
			// pravimo 100 racuna sa istim imenom da bismo proverili da li su generisani
			// brojevi svi razliciti

		}
		SoftAssert sa = new SoftAssert();
		for (int i = 0; i < racuni.length; i++) {
			String broj = racuni[i].getNumber();
			for (int j = i + 1; j < racuni.length; j++) {
				sa.assertNotEquals(broj, racuni[j].getNumber()); // ako hocemo da napusti petlju posle prvog neslaganja,
				// koristimo staticku assert -hard assert, koja tako funkcionise;
			}
		}
	}

	@Test
	public void toStringTest() {
		// Ocekivani format ispisa: broj<tab>ime<tab>stanje. Stanje treba da bude
		// zaokruženo na dve decimale.

		String ime = "Lela";
		String broj = "12345";
		Account racun = new Account(ime, broj);

		String s2 = String.format("%s %s %.2f", racun.getNumber(), racun.getName(), racun.getAmount());

		String s1 = String.format("%s %s %s %s %.2f", racun.getNumber(),"\t", racun.getName(),"\t",
				racun.getAmount());

		System.out.println(s1);
		System.out.println(s2);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(s2, s1);

		sa.assertAll();
	}
}
