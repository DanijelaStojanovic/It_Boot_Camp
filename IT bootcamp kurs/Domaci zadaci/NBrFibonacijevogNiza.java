package domaci21022020;

import java.util.Scanner;

public class Zadatak_4_0221 {

	public static void main(String[] args) {
		//Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("Koliko zelite da se prikaze brojeva Fibonacijevog niza? Imajuci u vidu da je u pitanju niz, molimo Vas unesite broj veci od 1.");
		int n = sc.nextInt();
		if (n>1) {
		int x=0;
		int y=1;
		System.out.println("Prvih " + n + " brojeva Fibonacijevog niza su: ");
		System.out.print(x);
		System.out.print(", "+y);
		for (int i=0; i<n-2; i++) {
				
		
		int z=x+y;
		x=y;
		y=z;
		
		System.out.print(", "+z);
		}
		}
		else
			System.out.println("Molimo Vas unesite pozitivan celobrojni broj, veci od 1");
	}
}
