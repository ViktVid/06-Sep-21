package zadatakNasledjivanje;

public class Software extends Racunar {

/* Napraviti klasu Software koja nasledjuje klasu Racunar i ima:
-naziv
-boolean da li je integrisan ili ne
-int meseci koliko cesto ima update */	
	
	private String naziv;
	private boolean integracija;
	private int update;
	
	public Software (String tip, double cena, boolean narucivanjeOnline, String naziv, boolean integracija, int update) {	
		super (tip, cena, narucivanjeOnline);
		this.naziv = naziv;
		this.integracija = integracija;
		this.update = update;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public boolean isIntegracija() {
		return integracija;
	}

	public void setIntegracija(boolean integracija) {
		this.integracija = integracija;
	}

	public int getUpdate() {
		return update;
	}

	public void setUpdate(int update) {
		this.update = update;
	}
	
	public void stampanje () {
		System.out.println("Racunar ima software: " + this.naziv);
		if (this.integracija) {
			System.out.println("Software je integrisan.");
		} else {
			System.out.println("Software nije integrisan.");
		}
		System.out.println("Update se izvrsava na: " + this.update);
	}
}
