package dete;

import java.util.ArrayList;

public class Dete {
	// Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	// kreira vise objekata klase Dete.
	// Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se
	// azurira.
	// Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje
	// prosecan broj decjih godina
	// (ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje
	// racunamo prosecne godine za to dvoje) .

	private String ime;
	private String prezime;
	private int godine;
	private int brKlikera;
	public static int brDece = 0;
	private static double suma = 0;
	private static double prosekGod;

	public Dete(String ime, String prezime, int godine, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.brKlikera = brKlikera;
		brDece++;
		suma+=godine;
	}

	public int dodajKlikere(int br) {
		if (br > 0)
			brKlikera += br;
		return brKlikera;
	}

	public int oduzmiKlikere(int br) {
		if (br > 0 && br <= brKlikera)
			brKlikera -= br;
		return brKlikera;
	}

	public int getBrKlikera() {
		return brKlikera;
		}

	public static double getProsek() {
		prosekGod = suma/brDece;
		return prosekGod;
	}
}
