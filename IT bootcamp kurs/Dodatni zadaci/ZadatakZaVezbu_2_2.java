package dodatni_zadaci;

import java.util.Scanner;

public class ZadatakZaVezbu_2_2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce da testira poznavanje while petlje na sledeci nacin:
		 * Ispisuje poruku sa pitanjem koja kljucna rec izlazi iz petlje u programskom
		 * jeziku Java, i ponudjene odgovore: A: int B: continue C: exit D: break
		 * Obezbediti da nakon odabira korisnik dobije informaciju da li je tacno
		 * odgovorio na pitanje.
		 * 
		 * Ukoliko nije, pitati ga da li zeli da pokusa ponovo i ako je odgovor potvrdan
		 * omoguciti ponovni pokusaj.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Provera poznavanja while petlje. Izaberite jedan od ponudjenih odgovora unosom slova ispred izabranog odgovora.");
		System.out.println("Pitanje: Koja kljucna rec se koristi za izlazak iz petlje u programskom jeziku Java?");
		System.out.println("A: int");
		System.out.println("B: continue");
		System.out.println("C: exit");
		System.out.println("D: break");

		String odgovor, nastavak;

		odgovor = sc.next();
		
		boolean error = true;
		while (error = true) {
			switch (odgovor) {
			case "D":
				System.out.println("Vas odgovor je tacan!");

				error = false;
				odgovor = sc.next();
				break;
			default:
				System.out.println("Niste uneli validan odgovor. Molimo Vas unesite jedan od ponudjenih odgovora.");
				odgovor = sc.next();
				break;
			case "A":
			case "B":
			case "C":
				System.out.println("Na zalost, vas odgovor nije tacan");
				System.out.println(
						"Da li zelite da pokusate ponovo? Ukoliko zelite, unesite Y, ukoliko ne zelite, unesite N");
				nastavak = sc.next();

				if (nastavak !="N" || nastavak!="Y") {
					System.out.println(
							"Niste uneli validnu opciju. Molimo unesite jednu od dve ponudjene opcije: Y ili N");
					odgovor = sc.next();
					
				}			
				else {
					switch (nastavak) {
					case "Y":
						System.out.println("Molimo vas unesite ponovo Vas odgovor");
						odgovor = sc.next();
						error = true;
						break;
					case "N": 
						System.out.println("Hvala na ucescu.");
						error = false;
						break;
					}
					break;
				}

			}
		}

	}
}
