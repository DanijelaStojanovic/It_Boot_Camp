package drum;

public class Automobil {
//Automobil ima serijski broj koji se zadaje pri kreiranju automobila. Serijski broj se moze samo dohvatiti.
	// Takodje poseduje snagu koja se moze dohvatiti i postaviti.
	// Auto poseduje vozaca i stvara se bez njega(u konstruktoru treba da se vozac
	// postavi na null);
	// Vozac se naknadno postavlja koristeci setter. Vozac se moze postaviti i
	// dohvatiti.
	// Automobil se ispisuje u sledecem formatu: SERIJSKI_BROJ{SNAGA}VOZAC
	private int serBr;
	private int snaga;
	private Vozac vozac;
	
	
	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public Automobil(int serBr, int snaga) {
		super();
		this.serBr = serBr;
		this.snaga = snaga;
		this.vozac = null;
	}

	public int getSerBr() {
		return serBr;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
//SERIJSKI_BROJ{SNAGA}VOZAC
	@Override
	public String toString() {
		return serBr + "{" + snaga + "}" + vozac;
	}
	
	
	
	
}
