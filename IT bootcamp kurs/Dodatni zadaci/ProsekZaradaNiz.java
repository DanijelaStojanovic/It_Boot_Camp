package dodatni_zadaci_test2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProsekZaradaNiz {

	public static void main(String[] args) {

		// 3. U sistemu postoji sedam korisnika. Korisnici unose iznos svoje mesecne
		// zarade sve dok ne unesu negativnu vrednost za iznos.
		// Nakon toga krece unos za sledeceg korisnika i tako dalje. Program se prekida
		// kada neki korisnik unese vrednost 0.
		// Pre prekida treba ispisati svim korisnicima prosecne plate.
		// Napomena: Dakle, obezbediti da ne mora svih sedam unositi zarade!

		Scanner sc = new Scanner(System.in);
		
		double zarada=0;
		double suma = 0;
		int brojac = 0;
		double avg = 0;
		double [] proseci = new double [7];
		
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Unesite zarade za " + (i+1) + ". korisnika");
			zarada = sc.nextDouble();
			
			 while (zarada > 0) {
					suma += zarada;
					brojac++;
					zarada=sc.nextDouble();
				}
			 
			avg=suma/brojac;
			proseci[i] = avg;
			if (zarada==0) {
				break;
			}else
				continue;

		}
		System.out.println(Arrays.toString(proseci));
	
	}

}
