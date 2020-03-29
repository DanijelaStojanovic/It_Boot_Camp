package domaci20022020;

public class Zadatak_3_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom, koristeci
		 * promenljive a, b, c koje su i deklarisane i definisane (kao sto smo na tabli
		 * vezbali na casu)
		 */

		// i++ post inkrement. Vrednost promenljive se prvo procita, a zatim uvecava za
		// 1.

		int a = 10;
		int c = 5;

		int b = a++ + c++; // b=15, jer se dodeljuje prvo procitana vrednost, dok su a i c uvecane za po 1
							// i u ovom trenutku su: a=11,c=6.
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		b = c++ - a++ + a++ - c++;// b=6-11+12-7=0, nakon ovog koraka ocekujemo a=13, c=8

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		// ++i pre inkrement. Vrednost promenljive se prvo uvecava za 1, a zatim
		// procita.

		a = 2;
		c = 4;

		b = ++a + ++c - ++a; // b=3+5-4=4, jer se dodeljuje uvecana vrednost, dok su a i c u ovom trenutku :
								// a= 4,c=5.

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		b = ++c - ++a + ++a;// b=6-5+6=7, nakon ovog koraka ocekujemo a=6, c=6.

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		// post dekrement (i--) Vrednost promenljive se prvo procita, a zatim umanjuje
		// za 1.

		b = b-- + a-- - c-- + c--; // b=7+6-6+5=12, nakon ovog koraka ocekujemo a=5, c=4.

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		b = a-- - b-- + c-- + b--; // b=5-12+4+11=8, nakon ovog koraka ocekujemo a=4, c=3.

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		// pre dekrement (--i) Vrednost promenljive se prvo umanjuje za 1, a zatim
		// procita.

		b = --b - --c + --a - --b - --c; // b= 7-2+3-6-1=1, nakon ovog koraka ocekivane vrednosti promenljivih su a=3,
											// c=1

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		b= --a + --a + --b - --c; // b= 2+1+0-0=3, nakon ovog koraka ocekivane vrednosti promenljivih su a=1, c=0.
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
	}

}
