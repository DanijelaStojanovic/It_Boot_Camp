package Ocene;


public class Student {
	
	private Ocena [] nizOcena=new Ocena[10];
	protected int poz = 0;
	
	
	public Student() {
		nizOcena= new Ocena[10];
	}



	public void dodajOcenu(Ocena o) {
		
			nizOcena [poz] = o;
			poz++;
		//for (int i = 0; i < nizOcena.length; i++) {
			//if (nizOcena[i] == null) {
				//nizOcena[i] = o;
				
				//break;
			//}
		//}

	}
	public Ocena[] getNizOcena() {
		return nizOcena;
	}
	public int getpoz() {
		return poz;
	}
	public  double getProsek(Ocena[] nizOcena) {
		double prosek;
		int suma=0;
		
				
		for (int i = 0; i < getpoz(); i++) {
			suma += nizOcena[i].getOcena();
		}
		prosek = suma /getpoz();

		return prosek;
	} 
}
