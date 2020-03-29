package domaci21022020;

import java.util.Scanner;

public class Zadatak_3_0221 {

	public static void main(String[] args) {
		// Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		//Primer: ulaz     m=3, n=7;

		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite broj kolona");
		int n=sc.nextInt();
		System.out.println("Unesite broj redova");
		int m=sc.nextInt();
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n ; j++) {
				System.out.print ("  *  ");
			}
			System.out.println();
		}
		
	}

}
