package drum;

public class Zadatak4_1 {

	public static void main(String[] args) {
		// Zadatak 1 Napraviti paket drum.
		// Unutar paketa drum, pisati klase.
		//Vozac ima ime i prezime koje se zadaje prilikom kreiranja vozaca. Vozac poseduje i broj vozacke dozvole koji se moze dohvatiti i postaviti. 
		// Ime vozaca se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u obliku:
		// IME_PREZIME{BROJ_VOZACKE}.
		//Automobil ima serijski broj koji se zadaje pri kreiranju automobila. Serijski broj se moze samo dohvatiti.
		// Takodje poseduje snagu koja se moze dohvatiti i postaviti.
		// Auto poseduje vozaca i stvara se bez njega(u konstruktoru treba da se vozac
		// postavi na null);
		// Vozac se naknadno postavlja koristeci setter. Vozac se moze postaviti i
		// dohvatiti.
		// Automobil se ispsuje u sledecem formatu: SERIJSKI_BROJ{SNAGA}VOZAC

			Vozac v1=new Vozac("Pera", "Peric");
			v1.setBrDozvole(12345);
			System.out.println(v1);
			Automobil a1=new Automobil(5555,120);
			System.out.println(a1.getSnaga());
			System.out.println(a1);
			a1.setVozac(v1);
			System.out.println(a1);
			
			
		
		
	}

}
