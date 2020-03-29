package dodatni_zadaci;

import java.util.Scanner;

public class ZadatakZaVezbu_2_1 {

	public static void main(String[] args) {
		// Napisati program koji ispituje da li je godina prestupna ili nije, sve dok
		// korisnik za godinu ne unese broj koji nije pozitivan.
		// Godina je prestupna kada je deljiva sa 400 ili kada je deljiva sa 4 a nije
		// deljiva sa 100.

		Scanner sc = new Scanner(System.in);

		int god;
		System.out.println("Molimo vas unesite godinu");
		god = sc.nextInt();
		
		while (god >= 0) {
			if (god % 4 == 0 && god % 100 != 0 || god % 400 == 0)
				System.out.println("Godina je prestupna");
			else
				System.out.println("Godina nije prestupna");

			god = sc.nextInt();
		}
		System.out.println("Uneli ste negativan broj za godinu. Program ce biti prekinut.");
	}

}
