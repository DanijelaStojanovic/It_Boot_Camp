package domaci02032020;

import java.util.Scanner;

public class Zadatak_2_0302 {

	public static void main(String[] args) {
		// Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		// niza koji su veci od svog indeksa
		// (preko konzole uneti duzinu i clanove niza)

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljenu duzinu niza");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("Unesite elemente niza:");
			int[] niz = new int[n];
			int proizvod = 1;
			for (int i = 0; i < niz.length; i++) {
				niz[i] = sc.nextInt(); // unos elemenata niza
			}
			for (int i = 0; i < niz.length; i++) {

				if (niz[i] > i) { // Provera da li je element niza veci od svog indeksa
					proizvod *= niz[i]; // proizvod clanova vecih od svog indeksa
				}
			}
			System.out.println("Proizvod elemenata niza koji su veci od svog indeksa je: " + proizvod);
		} else
			System.out.println("Molimo Vas unesite validnu duzinu niza, vecu od nula");

	}
}
