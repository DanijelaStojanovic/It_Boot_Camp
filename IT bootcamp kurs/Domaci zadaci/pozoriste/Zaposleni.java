package zadatak_2_0313.pozoriste;

public class Zaposleni {
	//Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen. 
	//Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].

	private String ime_prezime;
	private Pozoriste pozoriste;
	
	public Zaposleni(String ime_prezime, Pozoriste pozoriste) {
		
		this.ime_prezime = ime_prezime;
		this.pozoriste = pozoriste;
	}

	public String getIme_prezime() {
		return ime_prezime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	@Override
	public String toString() {
		return ime_prezime + "[" + pozoriste.getNaziv() + "]";
	}
	
	
	
}
