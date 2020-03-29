package domaci03092020;

import java.util.Scanner;

public class Zadatak_1_0309 {

	public static void main(String[] args) {
		//Glavni progam
		//Klase Sportista i Klub
		//Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

		
		
		Scanner sc=new Scanner(System.in);
		
		Sportista [] nizSportista= new Sportista [5];
		nizSportista[0] = new Sportista("Novica", "Velickovic", 1986);
		nizSportista[1] = new Sportista("Nemanja", "Gordic", 1988);
		nizSportista[2]= new Sportista("Ognjen", "Jaramaz", 1995);
		nizSportista[3] = new Sportista("Rade", "Zagorac", 1995);
		nizSportista[4]= new Sportista("Nikola", "Jankovic", 1994);
		
		Klub k1 = new Klub("Partizan", "Beograd", 1945, nizSportista);
		
		System.out.println(k1);
		
		System.out.println("Unesite novi naziv kluba " + k1.getNaziv() + ":");
		
		String noviNaziv=sc.nextLine();
		k1.setNaziv(noviNaziv);
		System.out.println("Novi naziv kluba je: " + k1.getNaziv());
		System.out.println("MVP kluba " + k1.getNaziv() + " je: " + nizSportista[0] );
	}

}
