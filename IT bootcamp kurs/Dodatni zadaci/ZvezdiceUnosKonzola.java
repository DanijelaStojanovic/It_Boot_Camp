package vezbezadomaci;

import java.util.Scanner;

public class ZvezdiceUnosKonzola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Unesite broj redova");
		
		int n= sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}

}
