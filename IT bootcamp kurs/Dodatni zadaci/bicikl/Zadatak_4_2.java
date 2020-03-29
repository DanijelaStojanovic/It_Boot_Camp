package bicikl;

public class Zadatak_4_2 {

	public static void main(String[] args) {
		// Lampa ima svoj status (on ili off) i boju kojom svetli.
		// Bicikl ima svoj tip, boju, visinu sedista koja moze da
		// se podesava i moze da sadrzi lampe. Moguce je procitati stanje svih
		// lampica. Podrazumevati da ih ima najvise 3.
		// Testirati prethodno napisane klase.

		Bicikl b1 = new Bicikl("bmx", "zuta", 75);
		Bicikl b2 = new Bicikl("Mountain bike", "plava", 80);

		Lampa l1 = new Lampa(true, "bela");
		Lampa l2 = new Lampa(false, "zuta");
		Lampa l3 = new Lampa(true, "zuta");
		Lampa l4 = new Lampa(true, "crvena");
		Lampa l5 = new Lampa(false, "crvena");

		System.out.println(l1.getStatus());

		b1.setVisina(65);
		System.out.println(b1.getVisina());
		b1.setBrLampi(3);
		b1.setLampe(l1);
		b1.setLampe(l2);
		b1.setLampe(l3);
		b1.setLampe(l4);
		System.out.println(b1);
		b2.setBrLampi(2);
		b2.setLampe(l4);
		b2.setLampe(l3);
		System.out.println(b2);
		b2.setBrLampi(5);
		System.out.println(b2.getBrLampi());
	}

}
