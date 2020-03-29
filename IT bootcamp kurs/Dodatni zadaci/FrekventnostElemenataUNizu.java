package dodatni_zadaci;

import java.util.Arrays;
import java.util.Scanner;

public class FrekventnostElemenataUNizu {
	public static int [] unosNiza(int brEl) {
		System.out.println("Unesite elemente niza:");
		int [] niz = new int[brEl];
		Scanner sc=new Scanner(System.in);
		
		for (int i=0; i<niz.length; i++) {
			niz[i]= sc.nextInt();
			
		}
		return niz;
	}
	public static void ispisNiza(int [] niz) {
		
		System.out.println(Arrays.toString(niz));
	}
	public static void main(String[] args) {
		// prebrojati koliko se cesto neki element pojavljuje u nizu
		//jedna for petlja za fiksiranje jednog broja, druga for petlja za uporedjivanje ostatka niza i brojac istih elemenata
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite br. elemenata niza");
		
		int n = sc.nextInt();
		int [] niz = unosNiza(n);
		System.out.println("Vas niz je:");
		ispisNiza(niz);
		
	//provera frekventnosti clanova
		for (int i=0; i<niz.length;i++) {
			int count=1;
			for (int j=i+1; i<niz.length; j++) {
					count++;
				
			}
			
			System.out.println("Element: " +  niz [i] + "Ponavlja se "+ count + " puta");
		}
		
	}

}
