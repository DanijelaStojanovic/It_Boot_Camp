package Ocene;

import java.util.Arrays;

public class Glavni {
	
		
	public static void main(String[] args) {
		// Napraviti klasu Ocena. Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju. 
		//Sadrzi naziv predmeta, i rok u kom je odrzan. 
		//Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek.
		//Prethodnu klasu testirati.

		
		
		Ocena o1= new Ocena(80, "OOP", "mart");
		Ocena o2=new Ocena(68, "Manuelno testiranje", "januar");
		Ocena o3=new Ocena(43, "Python", "jun");
		System.out.println(o1.vratiOcenu());
		o2.vratiOcenu();
		o3.vratiOcenu();
		
		Student s1= new Student();
		
		s1.dodajOcenu(o2);
		s1.dodajOcenu(o3);
		s1.dodajOcenu(o1);
		
		
		Ocena [] niz = s1.getNizOcena();
		
		System.out.println(Arrays.toString(niz));
		
		System.out.println(s1.getProsek(s1.getNizOcena()));
		
	}
		

		
		
		
		

	

}
