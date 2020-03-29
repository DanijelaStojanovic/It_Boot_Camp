package domaci28022020;

import java.util.Scanner;

public class Zadatak_3_0228 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		// rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5054
		// Ispis: Niz je rastuci.

		Scanner sc = new Scanner(System.in);
		System.out.println("Program za odredjivanje da li je uneti niz rastuci ili ne");

		System.out.println("Molimo Vas ucitajte zeljenu duzinu niza");
		int n = sc.nextInt();
		int[] niz = new int[n];
		boolean rastuci = true;

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". element prvog niza");
			niz[i] = sc.nextInt();
		}

		for (int i = 0; i < (n - 1); i++) {

			if (niz[i + 1] > niz[i]) // odredjivanje da li je element niza veci od prethodnog
				rastuci = true;
			else
				rastuci = false;

		}
		if (rastuci == true)
			System.out.println("Niz je rastuci");
		else
			System.out.println("Niz nije rastuci");

	}
}
