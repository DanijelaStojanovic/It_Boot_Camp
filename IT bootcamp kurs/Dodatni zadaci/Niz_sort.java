package dodatni_zadaci_test2;

import java.util.Arrays;
import java.util.Scanner;

public class Niz_sort {

	public static void main(String[] args) {
		// 1. Napraviti niz celih brojeva velicine 20.
		// Ucitavati sa standardnog ulaza elemente niza, a zatim ispisati 6 najmanjih
		// brojeva u jednom redu, a u narednom redu 5 najvecih.

		Scanner sc = new Scanner(System.in);

		System.out.println("Molimo vas unesite 20 celobrojnih, pozitivnih clanova niza");

		int[] niz = new int[20];

		for (int i = 0; i < 20; i++) { // unos niza
			niz[i] = sc.nextInt();
			if (niz[i] < 0) {
				System.out.println("Greska u unosu.Svi elementi moraju biti pozitivni");
				break;
			}
		}
		System.out.println(Arrays.toString(niz));
		
		//sortiranje niza, najmanji brojevi
		
		for (int i=0; i<20; i++) {
			int poz=i;
			int min=niz[i];
			for(int j=i+1; j<20; j++) {
				if (min>niz[j]) {
					min=niz[j];
					poz = j;
				}	
			}
			int temp = niz[i];
			niz[i] = niz[poz];
			niz[poz] = temp;	
		}
		
		System.out.println(Arrays.toString(niz));//provera sorta
		
		for(int i=0;i<6;i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
			for (int j=1;j<6;j++) {
			System.out.print( niz[20-j] + " ");
		}
		
	}

}
