package domaci03092020;



public class Sportista {
	//Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene.
	//Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
	
	private String ime;
	private String prezime;
	private int godRodjenja;
	private String klub;
	private Klub[] sviKlubovi;
	private int poz;
	
	
	public Sportista(String ime, String prezime, int godRodjenja) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.godRodjenja = godRodjenja;
	}
	
	public Sportista() {
		sviKlubovi = new Klub[30];
	}

	
	public Sportista(String ime, String prezime, String klub) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.klub = klub;
	}

	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodRodjenja() {
		return godRodjenja;
	}
	
	public String getKlub() {
		return klub;
	}

	public void dodajKlub(Klub k) {
		sviKlubovi [poz] = k;
		poz++;
		}
	public Klub [] getSviKlubovi () {
		for (int i=0; i<poz; i++) {
			System.out.println(sviKlubovi[i] + " ");
		}
		return sviKlubovi;
	}

	public String toString() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + ": "+ godRodjenja;
	}
	
	
}
