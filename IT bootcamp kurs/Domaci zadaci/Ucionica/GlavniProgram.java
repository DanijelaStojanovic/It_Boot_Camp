package ucionica;

import java.util.ArrayList;

public class Zadatak_1_0310 {

	public static void main(String[] args) {
		// Napraviti paket ucionica.
		//Unutar paketa ucionica, pisati klase.
		//Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika. Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
		//Polaznik se ispisuje u obliku: IME_PREZIME.
		//Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja. Marka moze samo da se dohvati. 
		//Lista polaznika koji koriste laptop moze da se prosiri i da se smanji. Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}


		Polaznik Lela=new Polaznik("Danijela", "Stojanovic");
		System.out.println(Lela);
		int br;
		Polaznik Milena = new Polaznik("Milena", "Peric");
		Polaznik Pera =new Polaznik("Pera", "Peric");
		
		
		Laptop vaio = new Laptop(Lela, "Sony vaio");
		
		Laptop hp = new Laptop(Pera, "HP");
		
		
		
		vaio.dodajPolaznika(Lela);
		vaio.dodajPolaznika(Milena);
		
		
		hp.dodajPolaznika(new Polaznik("Ivana", "Djokic"));
		hp.dodajPolaznika(Pera);
		hp.dodajPolaznika(new Polaznik("Zika", "Zikic"));
		
		System.out.println(vaio.getMarka().toUpperCase() + vaio);
		System.out.println(hp.getMarka().toUpperCase() + hp);
		
		hp.brisiPolaznika(Pera);
		System.out.println(hp.getMarka().toUpperCase() + hp);
	}

}
