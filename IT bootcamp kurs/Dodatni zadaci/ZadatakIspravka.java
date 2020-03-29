package dodatni_zadaci;

import java.util.Scanner;

public class ZadatakIspravka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		while (error == true) {

			switch (odgovor) {
			case "D":
				System.out.println("Vas odgovor je tacan!");
				error = false;
				break;
			default:
				System.out.println(
						"Niste uneli validan odgovor. Molimo Vas unesite jedan od ponudjenih odgovora.");
				odgovor = sc.next();
				break;
			case "A":
			case "B":
			case "C": {
				System.out.println("Na zalost, vas odgovor nije tacan");

				System.out.println(
						"Da li zelite da pokusate ponovo? Ukoliko zelite, unesite Y, ukoliko ne zelite, unesite N");
				nastavak = sc.next();
				while (!(nastavak.equals("N")) && !(nastavak.equals("Y"))) {
					System.out.println("Molimo unesite jednu od dve ponudjene opcije: Y ili N");
					nastavak = sc.next();
				} 
					switch (nastavak) {
					case "Y":
						System.out.println("Molimo vas unesite Vas novi odgovor");
						odgovor = sc.next();

						break;
					case "N":
						System.out.println("Hvala na ucescu.");
						error = false;
						break;
					
					}
				}

			}

			}

		}
	}

