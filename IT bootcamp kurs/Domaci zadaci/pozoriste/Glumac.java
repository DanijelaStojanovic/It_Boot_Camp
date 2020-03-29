package zadatak_2_0313.pozoriste;

public class Glumac extends Zaposleni {
	//Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
	
	private String uloga;

	public Glumac(String ime_prezime, Pozoriste pozoriste, String uloga) {
		super(ime_prezime, pozoriste);
		this.uloga = uloga;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(uloga).append("_").append(getIme_prezime());
		sb.append("[").append(getPozoriste());
		sb.append("]");
		
		return sb.toString();
	}

	public String getUloga() {
		return uloga;
	}
		
	
	
	
	
	
}
