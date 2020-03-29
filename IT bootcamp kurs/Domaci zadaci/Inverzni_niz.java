package domaci28022020;

import java.util.Scanner;

public class Zadatak_2_0228 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		// redosledom.
		// Primer niza: 32 54 123 18
		// Ispis: 18 123 54 32

		Scanner sc = new Scanner(System.in);
		System.out.println("Program koji ispisuje elemente proizvoljnog niza inverznim redosledom");

		System.out.println("Molimo Vas unesite zeljenu duzinu niza");
		int n = sc.nextInt();
		int[] niz = new int[n];

		System.out.println("Molimo Vas unesite zeljene elemente niza");
		for (int i = 0; i < n; i++) {
			niz[i] = sc.nextInt(); // unos elemenata niza
		}
		System.out.println("Vas niz ispisan inverznim redosledom je:");
		for (int i = n - 1; i >= 0; i--) { // ispis elemenata niza inverznim redosledom

			System.out.print(niz[i] + " ");
		}

	}
}
