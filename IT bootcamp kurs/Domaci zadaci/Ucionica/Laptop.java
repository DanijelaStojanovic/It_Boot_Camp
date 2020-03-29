package ucionica;

import java.util.ArrayList;
import java.util.Arrays;

//Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja. 
	//Marka moze samo da se dohvati. 
	//Lista polaznika koji koriste laptop moze da se prosiri i da se smanji. 
	//Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
public class Laptop {

	private ArrayList <Polaznik> polaznici;
	private String marka;
	
	public Laptop (String marka) {
		this.marka = marka;
		
		}

	
	
	public Laptop(Polaznik polaznici, String marka) {
		this.polaznici = new ArrayList<>();
		this.marka = marka;
	}


	public String getMarka() {
		return marka;
	}

	
	public void dodajPolaznika (Polaznik p) {
		polaznici.add(p);
		polaznici.size();
		
	}
	public void brisiPolaznika (Polaznik p) {
		
		polaznici.remove(p);
		
	}

	@Override
	public String toString () {
		return (Arrays.toString(polaznici.toArray()));
	}
	
}
