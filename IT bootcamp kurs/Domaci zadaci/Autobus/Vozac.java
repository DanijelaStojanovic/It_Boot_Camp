package Bus_vozac_putnik;

public class Vozac extends Covek {
	private String zanimanje;

	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		zanimanje = "sofer";
	}

	public String getZanimanje() {
		return zanimanje;
	}

	@Override
	public String toString() {
		return getIme() + " " + getPrezime();
	}

	
	
	
}
