package dete;

public class Glavni_program {

	public static void main(String[] args) {
		//Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se kreira vise objekata klase Dete. 
		//Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
		//Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih godina
		//(ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo prosecne godine za to dvoje) .

		Dete d1 = new Dete("Perica", "Peric", 5, 10);
		Dete d2 = new Dete("Uros", "Stojanovic", 3, 15);
		Dete d3 = new Dete("Tara", "Taric", 8, 7);
		Dete d4 =new Dete("Brzi", "Brzic", 10, 4);		
		d1.oduzmiKlikere(5);
		System.out.println(d1.getBrKlikera());
		d2.dodajKlikere(5);
		System.out.println(d2.getBrKlikera());
		
		
		System.out.println(Dete.getProsek());
	}

	

}
