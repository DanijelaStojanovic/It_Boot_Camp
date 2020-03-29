package dodatni_zadaci;

import java.util.Arrays;
import java.util.Scanner;

public class SahNizoviMetode {
	//Metoda za unos pozicija figura kao niza
	public static int[] unosNiza () {
		Scanner el = new Scanner(System.in);
		int[]niz= new int [4];
		for (int i = 0; i < 4; i++) { // ucitavam niz i proveravam da li su unete vrednosti validne -> od 1-8
			int pozicija = el.nextInt();
			while (pozicija < 1 || pozicija > 8) {
				System.out.println("Greska u unosu! Molimo unesite validnu vrednost pozicije. Sve vrednosti moraju biti izmedju 1 i 8");
				pozicija = el.nextInt();
			}
			niz[i] = pozicija;
		}
		return niz;
	}
	//metoda za ispis niza
	public static void ispisNiza (int [] niz) {
		System.out.println("Vase izabrane pozicije su:");
		System.out.println(Arrays.toString(niz));
	}	
	//metoda za proveru da li je skakac napadnut
	public static void proveriNapad(int [] niz) {
		if (niz[2] == niz[0] - 1 && (niz[3] == niz[1] + 1 || niz[3] == niz[1] - 1)) {
			System.out.println("Skakac je napadnut!");
		} else
			System.out.println("Skakac nije napadnut!");
		
		
	}
	public static void main(String[] args) {
		// Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni skakac sa vrha.
		// Korisnik prvo unosi poziciju piona kao dva cela broja, a zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu.
		// Program treba da ispise da li se figure nalaze u poziciji da je skakac napadnut.
		
		System.out.println("Program koji simulira ponasanje figure piona i skakaca u sahu i ispituje da li je skakac napadnut:");
		System.out.println("Unesite pozicije piona i skakaca kao cetiri prirodna broja od 1 do 8");
		
		int [] pozicije = unosNiza();
		ispisNiza(pozicije);
		proveriNapad(pozicije);
		
		
	}

}
