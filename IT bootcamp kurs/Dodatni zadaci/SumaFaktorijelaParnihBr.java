package dodatni_zadaci;

import java.util.Scanner;

public class SumaFaktorijelaParnihBr {

	public static void main(String[] args) {
		// Napisati program koji ce za ucitanu vrednost N izracunati vrednost sume faktorijela parnih brojeva do N:
		// S = 2! + 4! + 6! + … + N!
		Scanner sc= new Scanner(System.in);
		
		System.out.println ("Program za izracunavanje sume faktorijela parnih brojeva do nekog unetog broja\r\n " + "Molimo unesite zeljeni broj:");
		
		int n=sc.nextInt();
		
		int faktorijel=1;
		double s=0, p=1;
		for (int i=1;i<=n;i++) {
			 p=p*i; 
			 		 
			if (i%2==0) {
				s=s+p;
				
			}
		}
		System.out.println("Suma faktorijela parnih brojeva do unetog broja je: " + s);
				}
						
				}
		
	

