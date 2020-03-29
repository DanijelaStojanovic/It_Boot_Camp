package dodatni_zadaci_test2;

import java.util.Scanner;

public class BrSamoglasnika {

	public static int brSamoglasnika(String rec) {
		int br = 0;
		char[] slova;
		slova = rec.toCharArray();
		for (int i = 0; i < slova.length; i++) {
			if (slova[i] == 'a' || slova[i] == 'e' || slova[i] == 'i' || slova[i] == 'o' || slova[i] == 'u') {
				br++;
			}
		}

		return br;
	}

	public static void main(String[] args) {
		// 5. Napisati metodu koja ce da izbroji samoglasnike u prosledjenoj
		// reci.Testirati prethodno napisanu metodu.

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite proizvoljnu rec");
		String rec = sc.next();
		System.out.println(brSamoglasnika(rec));

	}

}
