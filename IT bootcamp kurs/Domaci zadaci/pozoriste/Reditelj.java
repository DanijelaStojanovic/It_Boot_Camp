package zadatak_2_0313.pozoriste;

public class Reditelj extends Zaposleni {
	//Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
	
	private String nadimak;

	public Reditelj(String ime_prezime, Pozoriste pozoriste, String nadimak) {
		super(ime_prezime, pozoriste);
		this.nadimak = nadimak;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nadimak).append("_").append(getIme_prezime());
		sb.append("[").append(getPozoriste());
		sb.append("]");
		
		return sb.toString();
	}

	public String getNadimak() {
		return nadimak;
	}
	
}
