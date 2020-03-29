package domaci05032020;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1_0305 {

	public static int[] ucitajNiz() { // metoda za ucitavanje niza
		Scanner sc = new Scanner(System.in);
		System.out.println("Molimo Vas unesite zeljeni broj elemenata niza");
		int brElem = sc.nextInt();
		
		
		while (brElem <= 0) {
			System.out.println("Pogresan unos! Molimo Vas unesite validan broj elemenata");
			brElem = sc.nextInt();
		}
		int[] niz = new int[brElem];
		System.out.println("Molimo Vas unesite elemente niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static void ispisiNiz(int niz[]) {
		System.out.println("Vas niz je:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
			
		}
		System.out.println();
	}

	public static boolean ispitajNiz(int[] niz) { // metoda za proveru da li je niz palindrom ili nije
		boolean palindrom=true;
		for (int i = 0; i < niz.length /2; i++) {
			if (niz[i] == niz[niz.length - 1 - i]) {
				palindrom=true;
			}else
				palindrom=false;
				
		}
		return palindrom;
	}

	public static void main(String[] args) {
		// Domaci zadatak “da li je niz celih brojeva palindrom ili nije” uradi
		// koristeci metode.

		
		int[] korisnickiNiz = ucitajNiz();

		ispisiNiz(korisnickiNiz);

		boolean palindrom = ispitajNiz(korisnickiNiz);
		
		if (palindrom ==true)
			System.out.println("Vas niz je palindrom");
		else
			System.out.println("Vas niz nije palindrom");
		
	}

}
