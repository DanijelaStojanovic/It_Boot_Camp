package vezbezadomaci;

import java.util.Scanner;

public class ZvezdiceDesniTrougao {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 System.out.println("unesite broj");
		 
		int n=sc.nextInt();
		
		 for (int i = 1; i <=n ; i++) {

			 for (int j = 0 ; j <= n-i; j++) {

		 System.out.print(" ");
			 }
			 for (int k = 1 ; k<=i ; k++) {
				 System.out.print("*");	 
		 }
			 System.out.println();
		 
		 }
			 
		for (int i=1; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
			System.out.print("*");
			System.out.print(" ");
			}
			System.out.println();
			}
			
			
			
			
			
			
			
			
		}
	} 
	
