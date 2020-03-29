package dodatni_zadaci;

import java.util.Scanner;

public class ZadatakZaVezbu_1_4 {

	public static void main(String[] args) {
		// Ucitati tri broja i ispisati njihov maksimum.

		Scanner s = new Scanner(System.in);

		System.out.println("Molimo Vas unesite prvi broj");
		double broj1, broj2, broj3;

		broj1 = s.nextDouble();

		System.out.println("Molimo Vas unesite drugi broj");
		broj2 = s.nextDouble();

		System.out.println("Molimo Vas unesite treci broj");
		broj3 = s.nextDouble();
		if (broj1 >= broj2 && broj1 >= broj3)
			System.out.println("Maksimum uneta tri broja je " + broj1);
		else if (broj2 >= broj1 && broj2 >= broj3)
			System.out.println("Maksimum uneta tri broja je " + broj2);
		else
			System.out.println("Maksimum uneta tri broja je " + broj3);

	}

}
