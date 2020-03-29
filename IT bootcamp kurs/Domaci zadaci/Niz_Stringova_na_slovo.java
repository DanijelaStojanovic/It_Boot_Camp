package domaci02032020;

import java.util.Scanner;

public class Zadatak_3_0302 {

	public static void main(String[] args) {
		// Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju
		// slovom d.

		Scanner sc = new Scanner(System.in);
		int broj = 0;
		System.out.println("Molimo vas unesite recenicu po izboru");

		String recenica = sc.nextLine();

		String[] reci = recenica.split(" ");

		for (int i = 0; i < reci.length; i++) {
			String r = reci[i];

			// if (r.startsWith("d")) Moze i ovo da se iskoristi :)
			if (r.charAt(0) == 'd') { // provera da li je prvo slovo reci = d
				broj++;
			}
		}
		System.out.println("Broj reci u Vasoj recenici koje pocinju slovom d je: " + broj);
	}

}
