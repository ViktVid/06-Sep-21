package zadatakNasledjivanje;

public class Monitor extends Hardware {


		// TODO Auto-generated constructor stub
	
/*   Napraviti klasu Monitor koja nasledjuje klasu Hardware i ima:
-double inch
-String rezolucija
-cena */
	
	private double inch;
	private String rezolucija;
	private double cena;
	
	public Monitor(String naziv, int cena2, boolean uKucistu, double inch, String rezolucija, double cena) {
		super(naziv, cena2, uKucistu, rezolucija, cena2, uKucistu);
	this.inch = inch;
	this.rezolucija = rezolucija;
	this.cena = cena;
	}

	
	
	public double getInch() {
		return inch;
	}

	public void setInch(double inch) {
		this.inch = inch;
	}

	public String getRezolucija() {
		return rezolucija;
	}

	public void setRezolucija(String rezolucija) {
		this.rezolucija = rezolucija;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public void stampanje() {
		
	}
}
