package bicikl;

import java.util.Arrays;

public class Bicikl {
	// Bicikl ima svoj tip, boju, visinu sedista koja moze da
	// se podesava i moze da sadrzi lampe. Moguce je procitati stanje svih
	// lampica. Podrazumevati da ih ima najvise 3.

	private String tip;
	private String boja;
	private int visina;
	private int brLampi;
	private String[] lampe = new String[3];

	public Bicikl(String tip, String boja, int visina) {
		super();
		this.tip = tip;
		this.boja = boja;
		this.visina = visina;

	}

	public String getTip() {
		return tip;
	}

	public String getBoja() {
		return boja;
	}

	public int getVisina() {
		return visina;
	}

	public void setBrLampi(int broj) {
		if (broj >3) {
			System.out.println("Broj lampi moze biti maksimum 3");
		} else
			brLampi = broj;
	}

	public void setLampe(Lampa l) {

		for (int i = 0; i < brLampi; i++) {
			if (lampe[i] == null) {
				lampe[i] = l.getStatus();
				break;
			}
		}
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}
	

	public int getBrLampi() {
		return brLampi;
	}

	public String[] getLampe() {
		return lampe;
	}

	@Override
	public String toString() {
		return "Bicikl [tip=" + tip + ", boja=" + boja + ", visina=" + visina + ", brLampi=" + brLampi + ", lampe="
				+ Arrays.toString(lampe) + "]";
	}

}
