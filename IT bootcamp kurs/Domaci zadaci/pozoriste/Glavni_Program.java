 package zadatak_2_0313.pozoriste;

public class Glavni_Program {

	public static void main(String[] args) {
		
	Pozoriste poz1 = new Pozoriste("Bitef");
	Pozoriste poz2 = new Pozoriste("Dadov");
	
	
	Glumac g1=new Glumac("Petar_Petrovic", poz1, "Romeo");
	Reditelj r1 = new Reditelj("Marko_Markovic", poz1, "Mare");
	Glumac g2 = new Glumac("Ivan_Ivanovic", poz2, "Kralj");
	
	System.out.println(poz1);
	
	System.out.println(g2);
	System.out.println(r1);
	
	Predstava p1= new Predstava("Romeo i Julija", poz1);
	Predstava p2 = new Predstava("Kraljevi podanici", poz2);
	
	p1.dodajZaposlene(g1);
	p1.dodajZaposlene(r1);
	p1.dodajZaposlene(g2);
	System.out.println(p1.getBrZaposlenih());
	p1.izbaciZaposlene(g2);
	
	p2.dodajZaposlene(g2);
	
	System.out.println(p1);
	System.out.println(p2);

		

		

	}

}
