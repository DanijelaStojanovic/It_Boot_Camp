package zadatak_2_0313.pozoriste;

public class Pozoriste {
	// Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate. 
	//Moze da se sastavi tekstualni opis u obliku naziv[id].

	private String naziv;
	private int id;
	private static int globalId=1;
	
	public Pozoriste(String naziv) {
		super();
		this.naziv = naziv;
		this.id=globalId;
		globalId++;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getId() {
		return id;
	}

	public static int getGlobalId() {
		return globalId;
	}

	@Override
	public String toString() {
		return naziv + "[" + id + "]";
	}
	
	
}
