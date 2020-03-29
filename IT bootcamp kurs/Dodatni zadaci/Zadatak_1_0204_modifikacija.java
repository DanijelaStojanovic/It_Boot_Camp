package vezbezadomaci;

import java.util.Scanner;

public class Zadatak_1_0204_modifikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Zadatak: Program koji racuna povrsinu prostorije.Ivice prostorije se
		 * ucitavaju preko konzole. Pretpostavka: soba ima zidove oblika pravougaonika i
		 * nema prozore. Dodatna pretpostavka: soba nema ni vrata.
		 */
		System.out.println("Kalkulator za izracunavanje povrsine okrecene prostorije");
		System.out.println("Molimo vas unesite duzinu prostorije (u m):");

		Scanner s = new Scanner(System.in);

		// a=duzina prostorije; b=sirina prostorije; c= visina prostorije; p=povrsina
		// okrecene prostorije

		float a, b, c, p;
		a = 0;
		a = s.nextFloat();
		System.out.println("Molimo vas unesite sirinu prostorije (u m):");
		b = 0;
		b = s.nextFloat();
		System.out.println("Molimo vas unesite visinu prostorije(u m):");
		c = 0;
		c = s.nextFloat();
		while (a <= 0 || b <= 0 || c <= 0) {
			System.out.println(
					"Niste uneli validne podatke. Duzina, sirina i visina prostorije moraju biti veci od nule.");
			System.out.println("Molimo vas pokusajte ponovo");
			System.out.println("Molimo vas unesite validnu duzinu prostorije (u m):");
			a = s.nextFloat();
			System.out.println("Molimo vas unesite validnu sirinu prostorije (u m):");
			b = s.nextFloat();
			System.out.println("Molimo vas unesite validnu visinu prostorije(u m):");
			c = s.nextFloat();
		}
		p = a * b + 2 * a * c + 2 * b * c;
		System.out.println("Povrsina okrecene prostorije (u m2) je:");
		System.out.println(p);

	}

}
