package domaci28022020;

import java.util.Scanner;

public class Zadatak_1_0228 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		// ispisuje elemente niza deljive brojem br.

		Scanner sc = new Scanner(System.in);

		System.out.println("Program za ispisivanje elemenata niza deljivih proizvoljnim brojem");

		System.out.println("Molimo Vas unesite zeljeni broj elemenata niza");
		int n = sc.nextInt();
		int[] niz = new int[n];

		System.out.println("Molimo Vas unesite proizvoljni broj");
		int br = sc.nextInt();

		for (int i = 0; i < n; i++) { // unos elemenata niza
			System.out.println("Unesite " + (i + 1) + ". element niza");

			niz[i] = sc.nextInt();
		}
		System.out.println("Elementi niza deljivi brojem " + br + " su:");

		for (int i = 0; i < niz.length; i++) {

			if (niz[i] % br == 0) { // provera da li su elementi niza deljivi sa brojem br

				System.out.print(niz[i] + " "); // ispis elemenata deljivih brojem br
			}

		}
	}
}
