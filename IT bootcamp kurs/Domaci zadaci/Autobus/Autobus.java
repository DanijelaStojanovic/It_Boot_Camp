package Bus_vozac_putnik;

import java.util.ArrayList;
import java.util.Arrays;

//Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja.
//Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
//Autobus ispisati u sledecem obliku:
//Naziv (vozac - Putnik1[novac], Putnik2 [novac],...)
public class Autobus {

	private String naziv;
	private Vozac vozac;
	private int cena;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, Vozac vozac, int cena, Putnik putnici) {

		this.naziv = naziv;
		this.vozac = vozac;
		this.cena = cena;
		this.putnici = new ArrayList<>();
	}

	public String getNaziv() {
		return naziv;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public int getCena() {
		return cena;
	}

	public ArrayList<Putnik> getPutnici() {
		return putnici;
	}

	public void dodajPutnika(Putnik p) {
		putnici.add(p);
		putnici.size();

	}

	public void skloniPutnika(Putnik p) {
		putnici.remove(p);

	}

	public void dodajVozaca(Vozac v) {
		vozac = v;
	}

	public void skloniVozaca(Vozac v) {
		vozac = null;

	}

	public void naplata(Putnik p) {
		if (vozac != null) {
			p.oduzmiNovac(cena);
		} else
			System.out.println("Nema vozaca u vozilu. Karte nece biti naplacene");
	}

	@Override
	public String toString() {
		return naziv + " (" + vozac + "-" + Arrays.toString(putnici.toArray()) + ")";
	}

}
