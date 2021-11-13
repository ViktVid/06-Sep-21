package pack06_09;

public class Reaction {

	private String tipReakcije;
	private String imeiPrezime;

	public Reaction(String tipReakcije, String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
		this.tipReakcije = tipReakcije;
	}

	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}

	public String getTipReakcije() {
		return tipReakcije;
	}

	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}

	public String getImeiPrezime() {
		return imeiPrezime;
	}

}
