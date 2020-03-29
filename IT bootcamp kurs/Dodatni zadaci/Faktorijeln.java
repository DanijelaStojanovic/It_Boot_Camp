package dodatni_zadaci;

import java.util.Scanner;

public class Faktorijeln {

	public static void main(String[] args) {
		// izracunati faktorijel nekog n broja

		/*Scanner sc= new Scanner(System.in);
		
		System.out.println ("Program za izracunavanje faktorijela nekog unetog broja\r\n " + "Molimo unesite zeljeni broj");
		
		int n=sc.nextInt();
		int faktorijel= 1;
		
		for( int i=n; i>=1 ; i--) {
			
			faktorijel= faktorijel*i;
		}
		System.out.println("Faktorijel broja " + n + " je: " + faktorijel);
		}
		
	}
*/
		int proizvod=1;
		 
	    for (int i=1; i<= 15; i++){
	        proizvod = proizvod * i;
	        System.out.println("Faktorijel broja "+ i +" je " + proizvod);
}
	}    
	}