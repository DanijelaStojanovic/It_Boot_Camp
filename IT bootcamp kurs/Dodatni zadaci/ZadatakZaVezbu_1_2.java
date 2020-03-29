package dodatni_zadaci;

import java.util.Scanner;

public class ZadatakZaVezbu_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Test se ocenjuje uzimajuci u obzir broj osvojenih poena na sledeci nacin:
		 * poeni <50 => ocena je 5 50<= poeni <60 => ocena je 6 60<= poeni <70 => ocena
		 * je 7 70<= poeni <80 => ocena je 8 80<= poeni <90 => ocena je 9 poeni >= 90 =>
		 * ocena je 10. Napisati program koji sa standardnog ulaza ucitava broj poena i
		 * korisniku ispisuje koju je ocenu dobio.
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Molimo Vas unesite broj osvojenih poena na testu");
		int poeni;
		poeni = 0;
		poeni = s.nextInt();
		while (poeni <= 0 || poeni > 100) {
			System.out.println("Broj poena mora biti ceo broj, veci od nule i manji ili jednak 100");
			System.out.println("Molimo vas unesite validan broj poena");
			poeni = s.nextInt();
		}
		if (poeni < 50)
			System.out.println("Vasa ocena je 5. Na zalost, niste polozili test");
		else if (poeni >= 50 && poeni < 60)
			System.out.println("Vasa ocena je 6. Cestitamo, polozili ste test");
		else if (poeni >= 60 && poeni < 70)
			System.out.println("Vasa ocena je 7. Cestitamo, polozili ste test");
		else if (poeni >= 70 && poeni < 80)
			System.out.println("Vasa ocena je 8. Cestitamo, polozili ste test");
		else if (poeni >= 80 && poeni < 90)
			System.out.println("Vasa ocena je 9. Cestitamo, polozili ste test");
		else if (poeni >= 90 && poeni <= 100)
			System.out.println("Vasa ocena je 10. Cestitamo, polozili ste test sa najvisom ocenom");

	}

}
