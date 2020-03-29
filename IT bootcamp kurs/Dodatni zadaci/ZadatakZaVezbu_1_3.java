package dodatni_zadaci;

import java.util.Scanner;

public class ZadatakZaVezbu_1_3 {

	public static void main(String[] args) {
		// Ucitati dva broja i ispisati koji od njih je veci.

		Scanner s = new Scanner(System.in);

		System.out.println("Molimo Vas unesite prvi broj");
		double broj1, broj2;
		broj1 = s.nextDouble();

		System.out.println("Molimo Vas unesite drugi broj");
		broj2 = s.nextDouble();

		if (broj1 > broj2)
			System.out.println("Prvi broj je veci!");
		else if (broj1 < broj2)
			System.out.println("Drugi broj je veci!");
		else
			System.out.println("Brojevi su jednaki!");
	}

}
