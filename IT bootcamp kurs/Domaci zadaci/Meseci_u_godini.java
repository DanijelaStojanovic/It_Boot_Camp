package domaci2;

import java.util.Scanner;

public class Zadatak_2_0206 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini
		 *  koji pocinju na to slovo(na taj glas) - za resavanje ovog zadatka koristiti switch
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite mesec");

		String mesec = sc.next();

		switch (mesec) {
		case "januar":
		case "jun":
		case "jul":
			System.out.println("Broj meseci u godini koji pocinju pocetnim slovom ovog meseca je 3");
			break;
		case "februar":
		case "septembar":
		case "oktobar":
		case "novembar":
		case "decembar":
			System.out.println("Broj meseci u godini koji pocinju pocetnim slovom ovog meseca  je 1");
			break;
		case "mart":
		case "maj":
			// System.out.println("Broj meseci u godini koji pocinju pocetnim slovom ovog meseca  je 2");
			// break;
			// gornje dve linije koda nisu neophodne jer je moguce spojiti case-eve za mart/maj i april/avgust
		case "april":
		case "avgust":
			System.out.println("Broj meseci u godini koji pocinju pocetnim slovom ovog meseca  je 2");
			break;
		default:
			System.out.println("Molimo vas unesite validan mesec, malim slovima");
			break;
		}
	}
}
