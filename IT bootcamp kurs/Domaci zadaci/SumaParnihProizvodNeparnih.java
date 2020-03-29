package domaci20022020;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju). podrazumeva se da se n ucitava preko
		 * standardnog ulaza
		 */

		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i, suma, proizvod;
		suma = 0;
		proizvod = 1;

		System.out.println("Molimo vas unesite koliko brojeva zelite da unesete");
		n = sc.nextInt();
		if (n <= 0)
			System.out.println("Molimo vas da unesete broj veci od nule");
		else {
			for (i = 0; i <= n; i++) {

				if (i % 2 != 0)
					proizvod *= i;

				else {
					suma += i;
				}

			}
			System.out.println("Proizvod neparnih brojeva od 0 do " + n + " je: " + proizvod);
			System.out.println("Suma parnih brojeva od 0 do " + n + " je: " + suma);
		}
	}
}
