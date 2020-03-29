package dodatni_zadaci;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeNizaproba {

	public static void main(String[] args) {
		// Proba sortiranja niza

		Scanner sc = new Scanner(System.in);

		// ucitavanje broja elemenata niza
		System.out.println("Molimo vas unesite zeljeni broj elemenata niza");
		int n = sc.nextInt();

		// ucitavanje niza
		System.out.println("Unesite elemente niza");
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}

		// ispis prvobitnog niza
		System.out.println("Vas uneti niz je:");
		System.out.println(Arrays.toString(niz));

		// sortiranje
		// jedna for petlja smanjuje preostali niz koji treba sortirati, dok druga for
		// petlja odredjuje mininum i menja mesta elementima niza

		for (int i = 0; i < niz.length; i++) {
			int poz = i;
			int min = niz[i];
			for (int j = i; j < niz.length; j++) {
				if (min > niz[j]) {
					min = niz[j];
					poz = j;
				}

			}
			int temp = niz[i];
			niz[i] = niz[poz];
			niz[poz] = temp;

		}
		System.out.println("Sortirani niz je:");
		System.out.println(Arrays.toString(niz));

	}

}
