package Bus_vozac_putnik;

public class GlavniProgram {

	public static void main(String[] args) {
		//Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
		//Svi podaci mogu da se dohvate, ali ne i postave.
		//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
		//Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
		//Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
		//Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja.
		//Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
		//Autobus ispisati u sledecem obliku:
		//Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )

		
		Vozac v1 = new Vozac("Pera", "Peric");
		System.out.println(v1.getIme() + " "+ v1.getPrezime()+ " " + v1.getZanimanje());
		
		Putnik p1 = new Putnik("Laza", "Lazic", 500);
		Putnik p2 = new Putnik("Mika", "Mikic", 150);
		Putnik p3 = new Putnik("Kosta", "Kostic", 1000);
		
		
		Autobus a1 = new Autobus("Lasta", v1, 150, p1);
		
		a1.dodajPutnika (p1);
		a1.dodajPutnika(p2);
		a1.dodajPutnika(p3);
		System.out.println(a1);
		
		a1.skloniPutnika(p3);
		a1.naplata(p1);
		
		System.out.println(a1);
		
		a1.skloniVozaca(v1);
		a1.naplata(p2);
		System.out.println(a1);
		
	}

}
