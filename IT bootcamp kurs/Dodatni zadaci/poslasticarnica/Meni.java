package poslasticarnica;

import java.util.ArrayList;





public class Meni {
	// U poslasticarnici postoji meni u kome svaka stavka treba da ima naziv i cenu koju je moguce menjati, kao i informaciju
	//o tome da li je trenutno dostupna u poslasticarnici.
	//Moguce je dohvatiti stavku sa zadate pozicije, kao i postaviti neku stavku.
	
	private ArrayList<Stavka> meni;

	public Meni(ArrayList<Stavka> meni) {
		super();
		this.meni = meni;
	}
	
	public Meni() {
	meni = new ArrayList<Stavka>();	////////obratiti paznju!!!U KONSTRUKTORU MORAM DA INICIJALIZUJEM LISTU!!!
	}

	public ArrayList<Stavka> getMeni() {
		return meni;
	}

	public void setMeni(ArrayList<Stavka> meni) {
		this.meni = meni;
	}
	public void dodajStavku(Stavka s) {
		meni.add(s);
		
	}
	public Stavka dohvatiStavku (String naziv) {
		Stavka s=null;
		for (int i=0; i<meni.size(); i++) {
			String trenutnaStavka=meni.get(i).getNaziv();
			
			if(naziv.equals(trenutnaStavka)) {
				s= meni.get(i);
				break;
			}
		
		}return s;
	}
			
	
}
