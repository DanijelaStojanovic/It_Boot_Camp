package domaci06032020;

import java.util.Scanner;

public class Zadatak_1_0306 {

	public static void main(String[] args) {
		// Glavni program za klasu Sportista
		// Napisati klasu Sportista. Sportista ima
		// 1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i
		// postavi
		// 2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i
		// postavi
		// 3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista
		// moze da promeni klub za koji igra.
		// 4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje moze i da
		// se dohvati i da se postavi.
		// Napisati glavni program koji kreira tri igraca. U glavnom programu
		// iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
		// Sportista.

		Sportista Mile = new Sportista("Milojko", "Milojkovic", "fudbal", "Partizan", 5);
		System.out.println("Prvi sportista je:");
		System.out.println(Mile.dohvatiIme() + " " + Mile.dohvatiPrez() + " koji igra " + Mile.dohvatiSport()
				+ " za klub " + Mile.dohvatiKlub() + " sa brojem dresa " + Mile.dohvatiDres() + ";");

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite novi klub u koji prelazi " + Mile.dohvatiIme() + " " + Mile.dohvatiPrez() + ":");
		String noviKlub = sc.nextLine();

		Mile.promeniKlub(noviKlub);
		System.out.println(Mile.dohvatiIme() + " " + Mile.dohvatiPrez() + " - klub " + Mile.dohvatiKlub() + ".");

		Sportista Rale = new Sportista("Radojko", "Radic", "Kosarka", "Partizan", 10);
		System.out.println("Podaci drugog sportiste su:");
		System.out.println(Rale.dohvatiIme() + " " + Rale.dohvatiPrez() + " " + Rale.dohvatiSport() + " "
				+ Rale.dohvatiKlub() + " " + Rale.dohvatiDres());
		System.out.println("Unesite novi klub u koji prelazi " + Rale.dohvatiIme() + " " + Rale.dohvatiPrez());
		String stariKlub = Rale.dohvatiKlub();
		noviKlub = sc.nextLine();
		int stariDres = Rale.dohvatiDres();
		System.out.println("Unesite novi broj dresa koji se dodeljuje igracu");
		int noviDres = sc.nextInt();
		Rale.promeniKlub(noviKlub);
		Rale.promeniDres(noviDres);
		System.out.println("Podaci igraca sa prihvacenim izmenama su:" + Rale.dohvatiIme() + " " + Rale.dohvatiPrez()
				+ " " + Rale.dohvatiKlub() + " " + Rale.dohvatiDres());

		Sportista Pera = new Sportista("Perica", "Peric", "Kosarka", "Buducnost", 8);
		System.out.println("Treci sportista je:" + Pera.dohvatiIme() + " " + Pera.dohvatiPrez());
		noviKlub = stariKlub;
		noviDres = stariDres;
		if (noviKlub == Rale.dohvatiKlub() && noviDres != Rale.dohvatiDres()) {
			System.out.println("Transfer igraca " + Pera.dohvatiIme() + " " + Pera.dohvatiPrez() + ": " + " iz kluba "
					+ Pera.dohvatiKlub() + " u klub " + noviKlub + " promena broja dresa iz " + Pera.dohvatiDres()
					+ " u " + noviDres + ".");

		} else {
			System.out.println(
					"Ovaj broj dresa je vec zauzet kod drugog igraca. Molimo Vas unesite drugi broj dresa, kako bi transfer bio uspesno kompletiran");
			noviDres = sc.nextInt();
			System.out.println("Transfer igraca " + Pera.dohvatiIme() + " " + Pera.dohvatiPrez() + ": " + "iz kluba "
					+ Pera.dohvatiKlub() + " u klub " + noviKlub + ", promena broja dresa iz " + Pera.dohvatiDres()
					+ " u " + noviDres + ".");

		}
	}
}