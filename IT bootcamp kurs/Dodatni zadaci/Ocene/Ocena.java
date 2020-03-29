package Ocene;

import java.util.Arrays;

public class Ocena {
	// Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na
	// ispitu i metodu koja vraca koja ocena je u pitanju.
	// Sadrzi naziv predmeta, i rok u kom je odrzan.
	// Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna
	// i vraca prosek.

	private int brPoena;
	private int ocena;
	private String predmet;
	private String rok;
	
	

	public Ocena(int brPoena, String predmet, String rok) {
		super();
		this.brPoena = brPoena;
		this.predmet = predmet;
		this.rok = rok;

	}

	public int getBrPoena() {
		return brPoena;
	}

	public String getPredmet() {
		return predmet;
	}

	public String getRok() {
		return rok;
	}

	public int getOcena() {
		return ocena;
	}

	public int vratiOcenu() {

		int poeni = getBrPoena();

		if (poeni < 0 && poeni > 100)
			System.out.println("Broj poena nije validan");
		else if (poeni >= 0 && poeni < 50)
			ocena = 5;
		else if (poeni >= 50 && poeni < 60)
			ocena = 6;
		else if (poeni >= 60 && poeni < 70)
			ocena = 7;
		else if (poeni >= 70 && poeni < 80)
			ocena = 8;
		else if (poeni >= 80 && poeni < 90)
			ocena = 9;
		else if (poeni >= 90 && poeni <= 100)
			ocena = 10;

		return ocena;
	}
	

	@Override
	public String toString() {
		return "Ocena [brPoena=" + brPoena + ", ocena=" + ocena + ", predmet=" + predmet + ", rok=" + rok + "]";
	}

	
	
	}


