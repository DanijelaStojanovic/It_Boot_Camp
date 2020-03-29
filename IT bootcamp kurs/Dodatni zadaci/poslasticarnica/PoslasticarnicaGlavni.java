package poslasticarnica;

public class PoslasticarnicaGlavni {

	public static void main(String[] args) {
		// U poslasticarnici postoji meni u kome svaka stavka treba da ima naziv i cenu koju je moguce menjati, kao i informaciju
		//o tome da li je trenutno dostupna u poslasticarnici.
		//Moguce je dohvatiti stavku sa zadate pozicije, kao i postaviti neku stavku.
		//Musterijama se mora izdavati racun koji sadrzi sve stavke sa menija koji ona kupuje, kao i ukupan iznos koji treba platiti.
		//Takodje se treba voditi racuna o tome da li je racun placen ili nije.

		Stavka s1 = new Stavka("mafin", 50, true);
		Stavka s2 = new Stavka("torta", 2000, false);
		Stavka s3 = new Stavka("kolaci", 200, true);
		Stavka s4 = new Stavka("sampita", 80, true);
		
		Meni m1= new Meni();
		m1.dodajStavku(s1);
		m1.dodajStavku(s4);
		m1.dodajStavku(s2);
		m1.dodajStavku(s3);
		
		
		Stavka s= m1.dohvatiStavku("torta");
		System.out.print("Stavka menija " + s + " :"  );
		System.out.println(s.getDostupnost());
		Stavka k =m1.dohvatiStavku("kolaci");
		
		System.out.println("Stavka menija " + k + " " + k.getDostupnost() + " i kosta: " + k.getCena() + " dinara.");
		
		Racun r1= new Racun(null, 0, false);
		r1.dodajStavke(s3);
		r1.dodajStavke(s4);
		r1.dodajStavke(s1);
		
		System.out.println("Iznos Vaseg racuna je : " + r1.getIznos());
		System.out.println("Racun " + r1.getPlacen());
		
		
	}
}
