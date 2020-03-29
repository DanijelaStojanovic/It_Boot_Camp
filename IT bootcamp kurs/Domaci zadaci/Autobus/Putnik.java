package Bus_vozac_putnik;

public class Putnik extends Covek {
	// Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu
	// novca koja mu se zadaje prilikom kreiranja.
	// Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno
	// vratiti indikator uspesnosti.

	private int novac;

	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public int getNovac() {
		return novac;
	}

	public boolean dodajNovac(int iznos) {
		if (iznos > 0) {
			novac += iznos;
			return true;
		}
		return false;
	}

	public boolean oduzmiNovac(int iznos) {
		if (iznos > 0 && iznos <= novac) {
			novac -= iznos;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return getIme() + " "+ getPrezime()+ "[" + novac + "]";
	}
	
	
	
}
