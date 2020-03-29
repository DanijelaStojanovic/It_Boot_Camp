package dodatni_zadaci;

import java.util.Scanner;

public class AritmetickaSredina {

	public static void main(String[] args) {
		// Napisati program za ispis aritmeticke sredine prirodnih brojeva do n. Suma elemenata podeljena sa brojem elemenata.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Unesite zeljeni broj");
		
		int n = sc.nextInt();
		double suma=0, broj=0;
		for (double i=1; i<=n; i++) {
			broj=broj+1;
			suma = suma + broj;
			
	}
			double as=suma/broj;
			System.out.println("Aritmeticka sredina brojeva do " + n + " je: " + as);
			
}
}