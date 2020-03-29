package domaci02032020;

import java.util.Scanner;

public class Zadatak_1_0302 {

	public static void main(String[] args) {
		// Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		// palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		// palindrom).
		// Korisnik unosi int [ ]
		// Napomena: cesto pitanje na intervjuima

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljenu duzinu niza");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("Unesite elemente niza:");
			int[] niz = new int[n];
			boolean palindrom = true;

			for (int i = 0; i < niz.length; i++) {
				niz[i] = sc.nextInt(); // ucitavanje elemenata niza
			}
			for (int i = 0; i < niz.length/2; i++) {
				if (niz[i] == niz[n - 1-i]) { // provera da li su poslednji i prvi clan jednaki, pretposlednji i
													// drugi itd...
					palindrom = true;

				} else
					palindrom = false;
			}

			if (palindrom == true)
				System.out.println("Niz je palindrom");
			else
				System.out.println("Niz nije palindrom");

		} else
			System.out.println("Molimo Vas unesite validnu duzinu niza, vecu od nula");
	}
}
