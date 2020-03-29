package domaci06032020;

import java.util.Scanner;

public class Sportista {
	private String ime;
	private String prezime;
	private String sport;
	private String klub;
	private int brDresa;

	public Sportista() {

	}

	public Sportista(String i, String p, String sp, String kl, int dres) {
		ime = i;
		prezime = p;
		sport = sp;
		klub = kl;
		brDresa = dres;
	}

	public String dohvatiIme() {
		return ime;
	}

	public String dohvatiPrez() {
		return prezime;
	}

	public String dohvatiSport() {
		return sport;
	}

	public String dohvatiKlub() {
		return klub;
	}

	public String promeniKlub(String noviKlub) {

		if (!noviKlub.equalsIgnoreCase(klub)) {
			klub = noviKlub;
		} else {
			System.out.println("Sportista ostaje u istom klubu!");
		}
		return klub;
	}

	public int dohvatiDres() {
		return brDresa;
	}

	public int promeniDres(int noviDres) {
		while (noviDres <= 0) {
			System.out.println("Greska. Molimo Vas unesite validan broj dresa.");
			Scanner sc = new Scanner(System.in);
			noviDres = sc.nextInt();

		}
		if (noviDres != brDresa) {
			brDresa = noviDres;
		} else {
			System.out.println("Broj dresa ostaje isti.");
		}
		return brDresa;
	}
}
