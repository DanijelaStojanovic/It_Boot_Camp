package domaci21022020;

public class Zadatak_2_0221 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */
		int broj = 0;

		for (int i = 9; i <= 250; i++) {

			if (i % 3 == 0) {
				broj = ++broj;
			}
			
		}
		System.out.println("Brojeva deljivih brojem 3 izmedju 9 i 250 ima ukupno:" + broj);
	}
}
