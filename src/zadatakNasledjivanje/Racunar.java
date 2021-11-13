package zadatakNasledjivanje;

public class Racunar {

/*    Napraviti klasu Racunar koja ima:
-tip
-cenu
-boolean da li moze da se poruci online

Podatke svake klase stampati u glavnoj klasi    */
	
	private String tip;
	private double cena;
	private boolean narucivanjeOnline;
	
	public Racunar(String tip, double cena, boolean narucivanjeOnline) {
		this.tip = tip;
		this.cena = cena;
		this.narucivanjeOnline = narucivanjeOnline;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public boolean isNarucivanjeOnline() {
		return narucivanjeOnline;
	}

	public void setNarucivanjeOnline(boolean narucivanjeOnline) {
		this.narucivanjeOnline = narucivanjeOnline;
	}
	
	public void stampanje() {
		System.out.println("Racunar je tipa: " + this.tip + "; Cena mu je: " + this.cena + "Narucivanje online: " + this.narucivanjeOnline);
	}
	
}
