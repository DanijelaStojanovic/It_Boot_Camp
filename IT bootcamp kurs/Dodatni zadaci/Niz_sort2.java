package dodatni_zadaci_test2;

import java.util.Arrays;
import java.util.Scanner;

public class Niz_sort2 {

	public static void main(String[] args) {
		 //1. Napraviti niz celih brojeva velicine 20.
			// Ucitavati sa standardnog ulaza elemente niza, a zatim ispisati 6 najmanjih
			// brojeva u jednom redu, a u narednom redu 5 najvecih.

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Unesite elemente niza");
		int [] niz= new int[20];
		
		for(int i=0; i<niz.length;i++) {
			niz[i]=sc.nextInt();
			while (niz[i] <0 ) {
				System.out.println("Unesite pozitivnu vrednost elementa niza");
				niz[i]=sc.nextInt();
			}
		}	
		
		System.out.println(Arrays.toString(niz));
		
		for (int i=0; i<niz.length; i++) {
			int min = niz [i];
			int poz=i;
			for(int j=i; j<niz.length;j++) {
				if(min>niz[j]) {
					min=niz[j];
					poz=j;
				}
					
			}
			int temp = niz[i];
			niz[i]=niz[poz];
			niz[poz]=temp;
			
		}
		System.out.println(Arrays.toString(niz));
		//stampa 6 najmanjih brojeva u jednom redu, a u narednom redu 5 najvecih.

		for (int i = 0; i< 6; i++) {
			System.out.print(niz[i] + " ");
			
		}
		System.out.println();
		for (int i=1; i<6; i++) {
			System.out.print(niz[20-i] + " ");
		}
	}

}
