package dodatni_zadaci;

import java.util.Scanner;

public class sortiranjeNizaOpadajuce {

//Metoda za unos niza
	public static int[] unosNiza(int n) {
		int[] niz = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite elemente niza");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

//Metoda za ispis niza
	public static void ispisiNiz(int[] niz) {
		
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}

//Metoda za sortiranje niza
	public static int[] sortirajNiz(int[] niz) {

		for (int i = 0; i < niz.length; i++) {
			int poz=i;
			int max = niz[i];
			for (int j = i ; j < niz.length; j++) {

				if (max < niz[j]) {
					max = niz[j];
					poz = j;
			}
			int temp = niz[i];
			niz[i] = niz[poz];
			niz[poz] = temp;
		}
		}
		return niz;
	}

	public static void main(String[] args) {
		// Java Program to sort the elements of an array in descending order

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Greska. Unesite pozitivan broj elemenata");
			n = sc.nextInt();
		}
		int[] korisnickiNiz = unosNiza(n);
		System.out.println("Elementi Vaseg originalnog niza su:");
		ispisiNiz(korisnickiNiz);
		int[] sortiraniNiz = sortirajNiz(korisnickiNiz);
		System.out.println("Sortirani niz je:");
		ispisiNiz(sortiraniNiz);

	}

}
