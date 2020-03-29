package dodatni_zadaci_test2;

import java.util.Scanner;

public class SrednjiKarakterStringa {
	public static char[] srednjiKarakter (String s) {
		char [] sred = new char[1];
		char sred1, sred2;
		char [] dvaSred = new char[2];
		
		if (s.length()%2 !=0) {
			
			sred [0]= s.charAt(s.length()/2);
		
		return sred;
		}
		else 	{
			sred1 = (s.charAt(s.length()/2-1));
			sred2 =  (s.charAt(s.length()/2));
			dvaSred [0]= sred1;
			dvaSred [1]=sred2;
		}return dvaSred;
	}
	public static void main(String[] args) {
		// 4. Napisati metodu koja ce naci srednji karakter stringa koji mu se prosledjuje kao argument.
		//Ukoliko niz znakova ima paran broj elemenata onda ce vratiti dva srednja karaktera.

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Unesite proizvoljnu rec");
		String rec = sc.next();
		System.out.println(srednjiKarakter(rec));
		
		
	}

}
