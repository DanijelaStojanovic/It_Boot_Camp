package domaci21022020;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije: 0 - Izlaz iz programa 1 - dodavanje cene
		 * proizvoda na racun (ubacivanje u potrosacku korpu) 2 - naplata racuna Ukoliko
		 * korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese opciju 1
		 * program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u
		 * prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika da unese
		 * kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost manju od
		 * vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da
		 * se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od
		 * cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se
		 * ponovo ispisuje meni.
		 */

		Scanner sc = new Scanner(System.in);

		int opcija;
		float cena, racun = 0, iznos = 0, kusur = 0;

		do {
			System.out.println("Molimo Vas izaberite jednu od sledecih opcija:\r\n" + "0 - Izlaz iz programa\r\n"
					+ "1 - dodavanje proizvoda na racun\r\n" + "2 - naplata racuna\r\n");
			String odgovor;
			opcija = sc.nextInt();

			switch (opcija) {
			case 0:
				System.out.println("Hvala sto ste koristili nase usluge");
				break;

			case 1:
				System.out.println("Molimo Vas unesite cenu proizvoda.");
				cena = sc.nextFloat();
				while (cena <= 0) {
					System.out.println("Molimo unesite ispravnu cenu. Cena mora biti veca od nule");
					cena = sc.nextFloat();
				}
				racun += cena;
				System.out.println("Ukoliko zelite da unesete sledeci proizvod, odgovorite sa Da");
				odgovor = sc.next();
				odgovor = odgovor.toLowerCase();

				while (odgovor.equals("da")) {

					System.out.println("Molimo Vas unesite cenu proizvoda.");
					cena = sc.nextFloat();
					System.out.println("Da li zelite da unesete sledeci proizvod? Odgovorite sa Da ukoliko zelite.");
					odgovor = sc.next();
					odgovor = odgovor.toLowerCase();
					
					while (cena <= 0) {
						System.out.println("Molimo unesite ispravnu cenu. Cena mora biti veca od nule");
						cena = sc.nextFloat();
					}
					racun += cena;
				}
				System.out.println("Vas trenutni racun je: " + racun + "din");
				break;

			default:
				System.out.println("Molimo Vas unesite samo jednu od ponudjenih opcija");
				break;
			case 2:
				System.out.println("Unesite kolicinu novca za naplatu");
				iznos = sc.nextFloat();
				if (racun == 0) {
					System.out.println("Nemate neplacene proizvode, vas racun je nula.");
				} else if (iznos < racun) {
					System.out.println("Nedovoljan iznos za naplatu. Pokusajte ponovo.");

				} else {
					kusur = iznos - racun;
					racun = 0;
					System.out.println("Racun je uspesno naplacen. Vas kusur je: " + kusur);
					break;
				}

			}

		} while (opcija != 0);

	}

}
