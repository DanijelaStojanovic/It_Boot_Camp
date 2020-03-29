package poslasticarnica;

public class Stavka {

	// svaka stavka treba da ima naziv i cenu koju je moguce menjati, kao i
	// informaciju
	// o tome da li je trenutno dostupna u poslasticarnici.
	private String naziv;
	private double cena;
	private boolean dostupnost;

	public Stavka(String naziv, double cena, boolean dostupnost) {
		super();
		this.naziv = naziv;
		this.cena = cena;
		this.dostupnost = dostupnost;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getDostupnost() {
		if (dostupnost==true) {
			return "je dostupna";
		}else
		return "nije dostupna";
	}

	@Override
	public String toString() {
		return naziv;
	}
}
