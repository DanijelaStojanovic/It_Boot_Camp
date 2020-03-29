package dodatni_zadaci;

import java.util.Scanner;

public class KasaPonovljena {

	public static void main(String[] args) {
		// Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		// * potrosace sadrzi sledece opcije: 0 - Izlaz iz programa 1 - dodavanje cene
		 //proizvoda na racun (ubacivanje u potrosacku korpu) 2 - naplata racuna Ukoliko
		 //* Korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese opciju 1
		 //* program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u
		 //prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika da unese
		 //kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost manju od
		 //vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da
		 //se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od
		 //cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se
		//ponovo ispisuje meni.
		
		Scanner sc=new Scanner(System.in);
		int opcija;
		float racun=0, iznos,kusur;
		do {
		System.out.println("Samousluzna kasa\r\n" + "Izaberite opciju\r\n"+ "1: Dodajte proizvod u korpu\r\n"
		+ "2: naplata racuna\r\n" + "0: Izlaz iz programa");
		
		opcija= sc.nextInt();
		
		
		switch (opcija) {
		case 0:
			System.out.println("Hvala sto ste koristili nase usluge");
		break;
		case 1:
			System.out.println("Unesite cenu proizvoda");
			
			float cena = sc.nextFloat();
			while (cena<= 0) {
				System.out.println("Molimo vas unesite validnu cenu");
				cena = sc.nextFloat();
			}
			racun = racun+cena;
			System.out.println("Vas trenutni racun je:" + racun);
		break;
			
		case 2:
			System.out.println("unesite iznos novca koji uplacujete");
			iznos=sc.nextFloat();
			
			while (iznos< racun) {
				System.out.println("Nedovoljan iznos za naplatu racuna. Molim vas unesite dovoljan iznos");
				iznos=sc.nextFloat();
				
			} 
			kusur= iznos - racun;
			System.out.println("Naplata uspesna. Kusur je:" + kusur);
			racun = 0;
				
				
				break;
				}
			
		
		} while (opcija !=0);
		
		
		}

}
