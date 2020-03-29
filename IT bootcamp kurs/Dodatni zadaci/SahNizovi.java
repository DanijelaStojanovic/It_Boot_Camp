package dodatni_zadaci;

import java.util.Arrays;
import java.util.Scanner;

public class SahNizovi {

	public static void main(String[] args) {
		// Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni
		// skakac sa vrha.
		// Korisnik prvo unosi poziciju piona kao dva cela broja,
		// a zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu.
		// Program treba da ispise da li se figure nalaze u poziciji da je skakac
		// napadnut.
		// Primeri: 6 4 7 4 ---> skakac nije napadnut
		// 6 4 5 5 ---> skakac jeste napadnut
		// 2 2 1 1 ---> skakac jeste napadnut
		// 9 1 6 8 ---> greska u unosu
		// treci element niza mora biti = prvi element-1!
		// cetvrti element niza mora biti = drugi element +1 ili drugi element-1!

		Scanner el = new Scanner(System.in);
		System.out.println(
				"Program koji simulira ponasanje figure piona i skakaca u sahu i ispituje da li je skakac napadnut:");
		System.out.println("Unesite pozicije piona i skakaca kao cetiri prirodna broja od 1 do 8");

		int[] niz = new int[4];

		for (int i = 0; i < 4; i++) { // ucitavam niz i proveravam da li su unete vrednosti validne - od 1-8!
			int pozicija = el.nextInt();
			while (pozicija < 1 || pozicija > 8) {
				System.out.println("Greska u unosu! Molimo unesite validnu vrednost pozicije. Sve vrednosti moraju biti izmedju 1 i 8");
				pozicija = el.nextInt();
			}
			niz[i] = pozicija;
		}
		System.out.println("Vase izabrane pozicije su:");
		System.out.println(Arrays.toString(niz));
		// sada krecem da proveravam uslov da li je skakac napadnut!
		// treci element niza mora biti = prvi element-1!
		// cetvrti element niza mora biti = drugi element +1 ili drugi element-1!

		if (niz[2] == niz[0] - 1 && (niz[3] == niz[1] + 1 || niz[3] == niz[1] - 1)) {
			System.out.println("Skakac je napadnut!");
		} else
			System.out.println("Skakac nije napadnut!");
		
	}
}
