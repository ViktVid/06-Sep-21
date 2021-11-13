package zadatakNasledjivanje;

public class Hardware extends Racunar {

/*	Napraviti klasu Hardware koja nasledjuje klasu Racunar i ima:
-naziv
-cenu
-boolean da li se nalazi unutar kucista ili ne */
	
	private String naziv;
	private int cena2;
	private boolean uKucistu;
	
	public Hardware (String tip, double cena, boolean narucivanjeOnline, String naziv, int cena2, boolean uKucistu) {
		super (tip, cena, narucivanjeOnline);
		this.naziv = naziv;
		this.cena2 = cena2;
		this.uKucistu = uKucistu;
	}



	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getCena2() {
		return cena2;
	}

	public void setCena2(int cena2) {
		this.cena2 = cena2;
	}

	public boolean isuKucistu() {
		return uKucistu;
	}

	public void setuKucistu(boolean uKucistu) {
		this.uKucistu = uKucistu;
	}
	
	public void stampanje () {
		System.out.println("Hardware racunara se zove: " + this.naziv + ", kosta: " + this.cena2);
		if (this.uKucistu) {
			System.out.println(" i nalazi se u kucistu.");
		} else {
			System.out.println(" i ne nalazi se u kucistu");
		}
	}
}
