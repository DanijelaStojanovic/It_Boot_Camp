package domaci20022020;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */
		Scanner sc = new Scanner(System.in);

		float br, zbir = 0;

		int i = 1;
		System.out.println("Unesite prvi broj");
		br = sc.nextFloat();
		while (br >= 0) {
			System.out.println("Unesite " + (i + 1) + ". broj");

			zbir = zbir + br;
			br = sc.nextFloat();
			i++;
		}

		System.out.println("Zbir unetih brojeva je " + zbir);
	}
}
