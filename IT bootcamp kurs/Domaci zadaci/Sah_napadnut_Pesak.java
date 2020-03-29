package domaci05032020;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_3_0305 {
	// Metoda za unos pozicija figura kao niza
	public static int[] unosNiza() {
		Scanner el = new Scanner(System.in);
		int[] niz = new int[4];
		for (int i = 0; i < 4; i++) { // ucitavam niz i proveravam da li su unete vrednosti validne -> od 1-8
			int pozicija = el.nextInt();
			while (pozicija < 1 || pozicija > 8) {
				System.out.println(
						"Greska u unosu! Molimo unesite validnu vrednost pozicije. Sve vrednosti moraju biti izmedju 1 i 8");
				pozicija = el.nextInt();
			}
			niz[i] = pozicija;
		}
		return niz;
	}

	// metoda za ispis niza
	public static void ispisNiza(int[] niz) {
		System.out.println("Vase izabrane pozicije su:");
		System.out.println(Arrays.toString(niz));
	}
	// metoda za proveru da li je pion napadnut

		public static void proveriNapad(int[] niz) {
			if (niz[2] == niz[0] - 1 && (niz[3] == niz[1] - 2 || niz[3] == niz[1] + 2))
				System.out.println("Pion je napadnut!");
			else if (niz[2] == niz[0] - 2 && (niz[3] == niz[1] - 1 || niz[3] == niz[1] + 1))
				System.out.println("Pion je napadnut!");
			else if (niz[2] == niz[0] + 1 && (niz[3] == niz[1] - 2 || niz[3] == niz[1] + 2))
				System.out.println("Pion je napadnut!");
			else if (niz[2] == niz[0] + 2 && (niz[3] == niz[1] - 1 || niz[3] == niz[1] + 1))
				System.out.println("Pion je napadnut!");
			else
				System.out.println("Pion nije napadnut!");
		}
		
		
	public static void main(String[] args) {
		// Zadatak sa sahom uraditi obrnuto, to jest, proveriti da li je pion napadnut.

		System.out.println(
				"Program koji simulira ponasanje figure piona i skakaca u sahu i ispituje da li je pion napadnut:");
		System.out.println("Unesite pozicije skakaca zatim piona, redom, kao cetiri prirodna broja od 1 do 8");
		int[] pozicije = unosNiza();
		ispisNiza(pozicije);
		proveriNapad(pozicije);

	}
	
	
}
