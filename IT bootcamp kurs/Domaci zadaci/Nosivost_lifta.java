package domaci2;

import java.util.Scanner;

public class Zadatak_1_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da
		 * li ce lift bezbedno krenuti u zavisnosti od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 * Pretpostavka: lift nosivosti 680kg moze primiti maksimalno 9 osoba.
		 * (Izvor:Pravilnik o tehnickim normativima za liftove)
		 */

		Scanner s = new Scanner(System.in);
		int br_osoba;
		// tezina prve osobe, druge, trece...devete//
		float osoba, ukupna_tezina = 0, trenutna_tezina = 0;

		System.out.println("Molimo vas unesite broj osoba");
		br_osoba = s.nextInt();
		if (br_osoba > 9 || br_osoba < 0)
			System.out.println("Unos nije validan. Broj osoba mora biti pozitivan broj. Max broj osoba je 9");
		else if (br_osoba == 0)
			System.out.println("Lift je prazan.");
		else {
			int n = 1;

			while (n <= br_osoba) {
				System.out.print("Molimo vas unesite tezinu (u kg) osobe broj ");
				System.out.println(n);

				osoba = s.nextFloat();
				if (osoba <= 0 || osoba > 200) {
					System.out.println("Molimo vas unesite validnu tezinu osobe (u kg).");// kao politicki korektnu max
																							// tezinu osobe sam uzela
																							// 200kg :)
				} else {
					n = n + 1;
					trenutna_tezina = trenutna_tezina + osoba;
				}
			}
			ukupna_tezina = ukupna_tezina + trenutna_tezina;
			System.out.print("Ukupna tezina (u kg) svih osoba u liftu je ");
			System.out.println(ukupna_tezina);
			if (ukupna_tezina < 680)
				System.out.println("Lift je pokrenut");
			else if (ukupna_tezina == 680)
				System.out.println("Opterecenje lifta je na granici!");
			else
				System.out.println("Lift je preopterecen!");

		}

	}

}
