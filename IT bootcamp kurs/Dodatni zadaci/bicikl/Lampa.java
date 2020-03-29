package bicikl;

public class Lampa {
	// Lampa ima svoj status (on ili off) i boju kojom svetli. 
	
	private boolean status;
	private String boja;
	
	public Lampa(boolean status, String boja) {
		
		this.status = status;
		this.boja = boja;
	}
	
	public String getStatus() {
		if (status==true) {
		return "on";	
		}else
		return "off";	
		}

	public String getBoja() {
		return boja;
	}
	
	
	
}
