package novoGradivo;

public class MotornoVozilo {
	private int brojVrata;
	private int brojTockova;
	private String registracija;

	public MotornoVozilo(int brojVrata, int brojTockova, String registracija) {
		this.brojVrata = brojVrata;
		this.brojTockova = brojTockova;
		this.registracija = registracija;
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}

	public int getBrojTockova() {
		return brojTockova;
	}

	public void setBrojTockova(int brojTockova) {
		this.brojTockova = brojTockova;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public void stampanje() {
		System.out.println("Vozilo sa registarskim tablicama " + this.registracija + " ima " + this.brojTockova
				+ " tockova i " + this.brojVrata + " vrata.");
	}
}
