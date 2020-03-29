package poslasticarnica;

import java.util.ArrayList;

public class Racun {
	//Musterijama se mora izdavati racun koji sadrzi sve stavke sa menija koji ona kupuje, kao i ukupan iznos koji treba platiti.
	//Takodje se treba voditi racuna o tome da li je racun placen ili nije.
	
	private ArrayList<Stavka> stavkeRacuna;
	private double iznos;
	private boolean placen;
	
	public Racun(ArrayList<Stavka> stavkeRacuna, double iznos, boolean placen) {
		stavkeRacuna = new ArrayList<Stavka>();
		this.stavkeRacuna = stavkeRacuna;
		this.iznos = iznos;
		this.placen = placen;
	}

	public ArrayList<Stavka> getStavkeRacuna() {
		return stavkeRacuna;
	}

	public double getIznos() {
		return iznos;
	}

	public String getPlacen() {
		if(placen==true) {
		return "placen";	
		}
		else
			return "nije placen";
	}

	public void dodajStavke(Stavka s) {
		stavkeRacuna.add(s);
		iznos+=s.getCena();
		
	}
	
	
	
}
