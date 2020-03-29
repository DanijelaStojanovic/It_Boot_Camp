package dodatni_zadaci;

import java.util.Scanner;

public class ZadatakZaVezbu_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Korisnik unosi dve dimenzije pravougaonika. Potrebno je proveriti da li je u
		// pitanju kvadrat i ispisati informaciju o tome.

		Scanner s = new Scanner(System.in);

		System.out.println("Molimo Vas unesite stranicu a");
		float a = 0;
		a = s.nextFloat();

		System.out.println("Molimo Vas unesite stranicu b");
		float b = 0;
		b = s.nextFloat();

		while (a <= 0 || b <= 0) {

			System.out.println(
					"Vrednosti koje ste uneli nisu validne. Stranice a i b moraju biti vece od nule. Molimo Vas unesite validne vrednosti");

			System.out.println("Molimo Vas ponovo unesite stranicu a");
			a = s.nextFloat();

			System.out.println("Molimo Vas ponovo unesite stranicu b");

			b = s.nextFloat();

		}
		if (a == b)
			System.out.println("Vrednosti unesenih stanica ukazuju da je u pitanju kvadrat");
		else
			System.out.println("Vrednosti unesenih stanica ukazuju da je u pitanju pravougaonik");
	}

}
