package dodatni_zadaci;

import java.util.Scanner;

public class MetodeOceneProba {

	public static void main(String[] args) {
		// U jednoj QA grupi ima 10 polaznika.
		// Predavac ucitava najpre rezultate prvog testa. Zatim rezultate drugog testa.
		// Nakon toga, zeli da vidi koliko su procenata uradili uzimajuci u obzir oba
		// testa.
		// (Sistem bodovanja je kao onaj koji se trenutno primenjuje u nasoj grupi :) )
		// Napraviti metodu koja ucitava niz zadatih dimenzija.
		// Napraviti metodu koja ispisuje zadati niz.
		// Napraviti metodu kojoj se proslede dva niza, a ona na osnovu njih pravi
		// treci, na nacin opisan u zahtevima zadatka.
		// Dodatak:
		// Ispisati redni broj polaznika koji ima najbolji prosek, kao i vrednost
		// preseka.

		int[] test1 = ucitajNiz(5);
		int[] test2 = ucitajNiz(5);

		double[] rez = prosek(test1, test2);

		ispisiNiz(rez);
		//najbolji(rez);
		ispisiNajbolje(rez);
		

	}

	public static int[] ucitajNiz(int brElem) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Unesite broj polaznika u QA grupi");
		int[] niz = new int[brElem];

		for (int i = 0; i < brElem; i++) {
			System.out.println("Unesite procenat " + (i + 1) + ". polaznika");
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static void ispisiNiz(double niz[]) {
		System.out.println("Prosek polaznika je:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}
//mpoje resenje
	/*public static double najbolji(double prosekNizova[]) {
		int poz = 0;
		double max = prosekNizova[0];
		for (int i = 0; i < prosekNizova.length; i++) {
			
			if (prosekNizova[i] > max) {
				max = prosekNizova[i];
				poz = i;
			}
		}
		System.out.println("Najbolji prosek ocena na dva testa od " + max + " ima polaznik sa rednim brojem " + (poz+1));
		return max;//posto max ne koristim u main metodi, ova metoda je mogla da bude void!!!
	}
*/
	
	//Ivanino resenje:
	
	public static double nadjiMax (double[] n) {
		double max = n[0];
		for(int i=1; i<n.length;i++) {
			
			if(n[i]>max) max=n[i];
			
			
		}
		return max;
		
	}

	public static void ispisiNajbolje(double [] niz){
		double max = nadjiMax(niz);
		System.out.println("Osobe koje imaju " + max + " poena su:");
		for(int i=0; i<niz.length; i++) {
			if(niz[i] == max) {
				System.out.println(i+1);
			}
		}
		
	}
	public static double[] prosek(int niz1[], int niz2[]) {
		double[] prosekNizova = new double[niz1.length];
		for (int i = 0; i < prosekNizova.length; i++) {
			prosekNizova[i] = (niz1[i] + niz2[i]) / 2.0; // ovde obratiti paznju na celobrojno deljenje!!!

		}
		return prosekNizova;

	}
}
