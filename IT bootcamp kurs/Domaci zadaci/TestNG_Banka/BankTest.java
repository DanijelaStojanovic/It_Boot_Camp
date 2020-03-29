package Banka_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest {
//Zadatak 2
	// Potrebno je napraviti test za ispravnost klase Bank. Za sve testove potrebno
	// je napraviti jedinstvenu banku koja se na početku testa resetuje.
	// Smatrati da ova banka ne može da ima nalog kod kojeg je stanje negativno.
	// Ako se na osnovu testova nađe neka greška u kodu potrebno jej da se popravi
	// originalni kod.

	// a.Potrebno je ispitati da li adekvatno radi otvaranje naloga, tako što će se
	// ubaciti 5 naloga i zatim ispitati da li se ti nalozi mogu dohvatiti.
	// b.Proveriti da li dobro radi metoda za uplatu novca.
	// c.Proveriti da li dobro radi metoda za transfer novca.
	// d.Proveriti da li dobro radi metoda za računanje ukupnog novca u banci
	// (getSumMoney).

	Bank b;// moze da se koristi u bilo kojoj anotaciji i imace vrednost koju mu dodelimo

	@BeforeClass

	public void pocetak() {

		b = new Bank();
		
	}

	@BeforeTest

	public void openAccountTest() {
		
		Account a1 = new Account("Danijela");
		Account a2 = new Account("Dusan");
		Account a3 = new Account("Uros");
		Account a4 = new Account("Vesna");
		Account a5 = new Account("Svetlana");

		a1.setAmount(60000d);
		a2.setAmount(100000d);
		a3.setAmount(100000000d);
		a4.setAmount(30000d);
		

	}

	@Test
	public void testGetAccount() {
		b.reset();
		Account a1 = b.openAccount("Danijela");
		Account a2=b.openAccount("Dusan");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(b.getAccount(a1.getNumber()), a1);
		sa.assertEquals(b.getAccount(a2.getNumber()), a2);
		sa.assertAll();
	}

	@Test
	//test metode za transfer novca
	public void testTransfer() {
		b.reset();
		Account a1 = b.openAccount("Danijela");
		Account a2 = b.openAccount("Dusan");

		a1.setAmount(10000.00);

		b.transferMoney(a1.getNumber(), a2.getNumber(), 1000.0);
		// a1 treba da bude 9000, a2 1000

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a1.getAmount(), 9000d);
		sa.assertEquals(a2.getAmount(), 1000d);
		sa.assertAll();
	}

	@Test
		// test metode za uplatu novca
		public void testPayInMoney() {
			b.reset();
			Account a1 = b.openAccount("Danijela");
			b.payInMoney(a1.getNumber(), 5000d);
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(a1.getAmount(), 5000d);
			sa.assertAll();
		}

		
	@Test
	// test metode za računanje ukupnog novca u banci
	public void testSumMoney() {
		b.reset();
		Account a1 = b.openAccount("Danijela");
		Account a2 = b.openAccount("Dusan");
		Account a3 = b.openAccount("Uros");
		a1.setAmount(10000d);
		a2.setAmount(5000d);
		a3.setAmount(15000d);
		//SoftAssert sa = new SoftAssert();
		double suma=b.getSumMoney();
		Assert.assertEquals(suma, 30000d);
		

	}
}