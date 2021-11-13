package novoGradivo;

public class Kamion extends MotornoVozilo {

	private int tezina;
	private int brojPrikolica;
	private String tip;

	public Kamion(int brojVrata, int brojTockova, String registracija, int tezina, int brojPrikolica, String tip) {
		super(brojVrata, brojTockova, registracija);
		this.tezina = tezina;
		this.brojPrikolica = brojPrikolica;
		this.tip = tip;
	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

	public int getBrojPrikolica() {
		return brojPrikolica;
	}

	public void setBrojPrikolica(int brojPrikolica) {
		this.brojPrikolica = brojPrikolica;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public void stampanje() {
		System.out.println(
				this.tip + " kamion je tezak " + this.tezina + " tona i ima " + this.brojPrikolica + " prikolice.");
		System.out.println("Vozilo ima " + super.getBrojTockova() + " tockova.");
	}

}
