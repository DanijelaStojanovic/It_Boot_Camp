package zadatak_2_0313.pozoriste;

import java.util.ArrayList;

public class Predstava {
	//Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave. 
	//Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
	//Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom, 
	//a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList <Zaposleni> zaposleni = new ArrayList<Zaposleni>();
	
	public Predstava(String naziv, Pozoriste pozoriste) {
	
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		
		
	}

	public void dodajZaposlene(Zaposleni z) {
	zaposleni.add(z);
	zaposleni.size();
	}
	public void izbaciZaposlene (Zaposleni z) {
		zaposleni.remove(z);
		
	}
	
	public int getBrZaposlenih () {
		return zaposleni.size();
		
	}
	
	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}

	@Override
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(", ").append(getPozoriste().getNaziv());
		sb.append("\n");
		for (int i=0; i<zaposleni.size(); i++) {
		sb.append(zaposleni.get(i)).append("\n");
		
		}
		return sb.toString();
	}
	
	
	
}
