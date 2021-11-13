package novoGradivo;

public class Prikolica extends Kamion {
	private String tipPrikolice;
	private String nacinPovezivanja;
	private int brojOsovina;

	public Prikolica(int brojVrata, int brojTockova, String registracija, int tezina, int brojPrikolica, String tip,
			String tipPrikolice, String nacinPovezivanja, int brojOsovina) {
		super(brojVrata, brojTockova, registracija, tezina, brojPrikolica, tip);
		this.tipPrikolice = tipPrikolice;
		this.nacinPovezivanja = nacinPovezivanja;
		this.brojOsovina = brojOsovina;
	}

	public String getTipPrikolice() {
		return tipPrikolice;
	}

	public void setTipPrikolice(String tipPrikolice) {
		this.tipPrikolice = tipPrikolice;
	}

	public String getNacinPovezivanja() {
		return nacinPovezivanja;
	}

	public void setNacinPovezivanja(String nacinPovezivanja) {
		this.nacinPovezivanja = nacinPovezivanja;
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}

	public void stampanje() {
		System.out.println("Prikolica ima " + this.brojOsovina + " osovina, povezana je " + this.nacinPovezivanja
				+ ". Povezana je na " + super.getTip() + " kamion.");
	}

}
