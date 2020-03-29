package itbootcamp.vezbanje;

import java.util.Scanner;

public class PoznavanjeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		boolean b = true;

		while (b = true) {
			System.out.println("Koja kljucna rec izlazi iz petlje u programskom jeziku Java:\r\n" + "A: int\r\n"
					+ "B: continue\r\n" + "C: exit\r\n" + "D: break\r\n");

			String odgovor = s.nextLine();
			odgovor = new String(odgovor);
			odgovor = odgovor.toLowerCase();
			if (odgovor.equals("d") || odgovor.equals("break")) {
				System.out.println("Odgovor je tacan.");
				break;
			} else {
				System.out.println("Odgovor nije tacan.");
				System.out.println("Da li zelite da pokusate ponovo: Da ili Ne");
				String odgovor2 = s.nextLine();
				odgovor2 = odgovor2.toLowerCase();
				if (odgovor2.equals("da")) {
					continue;
				} else {
					break;
				}
			}
		}

	}
}
