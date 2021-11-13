package novoGradivo;

public class Autobus extends MotornoVozilo {
	private int brojSedista;
	private boolean mestoZaStajanje;
	private String tipAutobusa;

	public Autobus(int brojVrata, int brojTockova, String registracija, int brojSedista, boolean mestoZaStajanje,
			String tipAutobusa) {
		super(brojVrata, brojTockova, registracija);
		this.brojSedista = brojSedista;
		this.mestoZaStajanje = mestoZaStajanje;
		this.tipAutobusa = tipAutobusa;
	}

	public int getBrojSedista() {
		return brojSedista;
	}

	public void setBrojSedista(int brojSedista) {
		this.brojSedista = brojSedista;
	}

	public boolean isMestoZaStajanje() {
		return mestoZaStajanje;
	}

	public void setMestoZaStajanje(boolean mestoZaStajanje) {
		this.mestoZaStajanje = mestoZaStajanje;
	}

	public String getTipAutobusa() {
		return tipAutobusa;
	}

	public void setTipAutobusa(String tipAutobusa) {
		this.tipAutobusa = tipAutobusa;
	}

	public void stampanje() {
		System.out.println(this.tipAutobusa + " autobus ima " + this.brojSedista + " broj sedista.");
		if (this.mestoZaStajanje) { // 2. nacin - this.mestoZaStajanje = true ) ...
			System.out.print("Ima ");
		} else {
			System.out.print("Nema ");
		}
		System.out.println("mesta za stajanje.");
	}

}
