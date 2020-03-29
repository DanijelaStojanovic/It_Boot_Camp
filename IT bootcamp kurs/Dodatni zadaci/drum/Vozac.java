package drum;

public class Vozac {
	//Vozac ima ime i prezime koje se zadaje prilikom kreiranja vozaca. Vozac poseduje i broj vozacke dozvole koji se moze dohvatiti i postaviti. 
	//Ime vozaca se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u obliku: IME_PREZIME{BROJ_VOZACKE}.
	
	private String ime;
	private String prezime;
	private int brDozvole;
	
	public Vozac(String ime, String prezime, int brDozvole) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brDozvole= brDozvole;
		
	}

	

	public Vozac(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}



	public int getBrDozvole() {
		return brDozvole;
	}

	public void setBrDozvole(int brDozvole) {
		this.brDozvole = brDozvole;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {//IME_PREZIME{BROJ_VOZACKE}.
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + "{" + brDozvole + "}";
	}
	
	
}
