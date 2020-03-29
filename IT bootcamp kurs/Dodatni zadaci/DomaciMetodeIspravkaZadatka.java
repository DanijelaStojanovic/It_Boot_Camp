package dodatni_zadaci;

import java.util.Scanner;

public class DomaciMetodeIspravkaZadatka {

    //Ovaj kod predstavlja kalkulator povrsina 
	//kvadrata, pravougaonika i kruga.
	//Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
	//Ukoliko se unese 'izadji', program treba da se zavrsi.
	//Program treba da se ponavlja dokle god se ne unese izadji.


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String figura;
		boolean nastavi=true;
		
		while(true) {
			figura=sc.nextLine();
			switch(figura) {							//dodala sam continue posle svakog case-a, da se vraca na pocetak switch-a;
			case "kvadrat":racunajKvadrat();
			continue;									
			case "pravougaonik":racunajPravougaonik(); //slovna greska - pravougaionik
			continue;
			case "krug":racunajKrug();	
			continue;
			case "izadji":return;
			default:
				System.out.println("Pogresan unos!");
				nastavi=false;
			}
		}
	}

	public static void racunajKrug() {
		Scanner sc= new Scanner(System.in);
		double r;
		r=sc.nextDouble();
		if(r<=0) { System.out.println("Los unos!");return;}
		System.out.println("Povrsina kruga je: "+pKruga(r)); //ovde je stajalo  pravougaonika umesto kruga
	}

	public static void racunajPravougaonik() {
		Scanner sc= new Scanner(System.in);
		double a, b;
		a=sc.nextDouble();
		b=sc.nextDouble();
		if(a<=0 || b<=0) { System.out.println("Los unos!");return;}
		System.out.println("Povrsina pravougaonika je: "+pPravougaonika(a, b)); // ovde je opet bila slovna greska pravougaionik
		
	}

	public static void racunajKvadrat() {
		Scanner sc= new Scanner(System.in);
		double a;
		a=sc.nextDouble();
		if(a<=0) { System.out.println("Los unos!");return;}
		System.out.println("Povrsina kvadrata je: "+pKvadrata(a)); // ovde se pogresno pozivala metoda za racunanje kruga
		
	}
	public static double pKruga(double r) {
		return r*r*3.14;
	}
	public static double pKvadrata(double a) { //ovde je u argumentu stajao pogresan tip promenjive  int 
		return a*a; // bila je pogresna formula za povrsinu kvadrata, jedno *a je bilo visak
	}
	public static double pPravougaonika(double a, double b) {
		return a*b;
	}
}


