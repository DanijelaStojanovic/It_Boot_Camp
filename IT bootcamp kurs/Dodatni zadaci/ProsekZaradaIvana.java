package dodatni_zadaci_test2;

import java.util.Arrays;
import java.util.Scanner;

public class ProsekZaradaIvana {

	public static double ProsecnaVrednost(double ukIznos, int brojac) {
		double prosek = ukIznos / brojac;
		return prosek;
	}

	public static void UnesiPlatu(Scanner sc) {

		double ukIznos = 0;
		int brojac = 0;
		double iznos;
		double niz[] = new double[2];
		double niz1[] = new double[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Unesi plate za: " + (i + 1) + ". korisnika:");
			iznos = sc.nextDouble();
			ukIznos = 0;
			brojac = 0;
			while (iznos > 0) {
				ukIznos += iznos;
				brojac += 1;
				niz[0] = ukIznos;
				niz[1] = brojac;
				niz1[i] = ProsekPlata(niz);
				iznos = sc.nextDouble();
			}
			if (iznos == 0) {
				break;
			} else {
				continue;
			}
		}
		System.out.println("Prosecne plate su: ");
		System.out.println(Arrays.toString(niz1));
	}

	public static double ProsekPlata(double[] niz) {
		double prosek = niz[0] / niz[1];
		return prosek;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		UnesiPlatu(s);
	}

}
