package dodatni_zadaci_test2;

import java.util.Scanner;

public class Stringovi_contains {

	public static void main(String[] args) {
		// 2. Ucitati jednu rec sa standardnog ulaza, zatim drugu i proveriti da li prva
		// rec u sebi sadrzi drugu i ispisati ishod provere.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvu proizvoljnu rec");
		String rec1 = sc.next();
		rec1=rec1.toLowerCase();
		System.out.println("Unesite drugu proizvoljnu rec");
		String rec2 = sc.next();
		rec2=rec2.toLowerCase();
		if (rec1.contains(rec2)) {
			System.out.println("Prva rec sadrzi drugu rec!");
		} else {
			System.out.println("Prva rec ne sadrzi drugu rec.");
		}

	}
}