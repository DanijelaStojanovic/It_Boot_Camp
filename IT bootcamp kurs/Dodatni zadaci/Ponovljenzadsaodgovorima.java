package dodatni_zadaci;

import java.util.Scanner;

public class Ponovljenzadsaodgovorima {

	public static void main(String[] args) {
		// Napisati program koji ce da testira poznavanje while petlje na sledeci nacin:
		// * Ispisuje poruku sa pitanjem koja kljucna rec izlazi iz petlje u programskom
		// * jeziku Java, i ponudjene odgovore: A: int B: continue C: exit D: break
		// * Obezbediti da nakon odabira korisnik dobije informaciju da li je tacno
		// * odgovorio na pitanje.
		// * 
		// * Ukoliko nije, pitati ga da li zeli da pokusa ponovo i ako je odgovor potvrdan
		// * omoguciti ponovni pokusaj.

		 Scanner sc=new Scanner(System.in);
		 
		
		 
		boolean error=true;
		 while (error==true) {
			 System.out.println("Test pitanje: Koja kljucna rec izlazi iz While petlje?\r\n" + "Izaberite jedan od sledecih odgovora: \r\n"
					 + "A: int\r\n" + "B: continue\r\n" + "C: Exit\r\n" + "D: break\r\n");
			 String odgovor= sc.next();
			 odgovor=odgovor.toUpperCase();
			  
		 switch (odgovor) {
		 		 default: 
		 			 System.out.println("Molimo unesite neki od validnih odgovora");
		 			 break;
		 		 case "D":
		 			 System.out.println("Cestitamo, vas odgovor je tacan! Polozili ste!");
		 			 error=false;
		 			 break;
		 		 case "A":
		 		 case "B":
		 		 case "C":
		 			 System.out.println("Netacan odgovor\r\n" + "Da li zelite da pokusate ponovo?\r\n");
		 			 String nastavak=sc.next();
		 			if(!(nastavak.equalsIgnoreCase("da"))) {
		 				System.out.println("Hvala na ucescu.");
		 				error=false;
		 				break;
		 			}

		 			
		 			}
		 } 
			 
		 }
		 
		
	}


