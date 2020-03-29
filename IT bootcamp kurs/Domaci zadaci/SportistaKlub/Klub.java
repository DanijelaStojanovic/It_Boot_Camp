package domaci03092020;

import java.util.Arrays;

public class Klub {
	
	//Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista. Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	//Napisati metodu koja ce ispisati ceo objekat klase klub.
	
	private String naziv;
	private String grad;
	private int godOsnivanja;
	private Sportista[] nizSportista=new Sportista[20];
	
	
	
	
	public Klub(String naziv, String grad, int godOsnivanja, Sportista[] nizSportista) {
		super();
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		
		
	}

	public Klub(String naziv) {
		super();
		this.naziv = naziv;
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrad() {
		return grad;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	
	public void setNizSportista(Sportista s) {
		
	for (int i=0; i<nizSportista.length; i++) {
		if (nizSportista[i]== null) {
			nizSportista[i] = s;
			break;
		}
	}
		
}


	@Override
	public String toString() {
		return "Klub [naziv=" + naziv + ", grad=" + grad + ", godOsnivanja=" + godOsnivanja + ", nizSportista="
				+ Arrays.toString(nizSportista) + "]";
	}
	
	
}
