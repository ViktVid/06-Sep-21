package pack06_09;

import java.util.ArrayList;

public class Facebook {
	/*
	 * 1) Kreirati klasu Reakcija koja ima tip reakcije (smajli, like, srce), ime i
	 * prezime korisnika koji je reagovao, getere, setere i konstruktore. Kreirati
	 * klasu FacebookPost koja ima: ime i prezime korisnika koji je stavio oglas
	 * tekst objave listu reakcija metodu reaguj, koja dodaje reakciju u niz
	 * privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip
	 * reakcije koji moze da bude smajli, like ili srce) metodu stampaj koja stampa
	 * info o postu u formatu: ime i prezime tekst objave smajli 10 | like 15 | srce
	 * 2
	 */

	private String imeiPrezime;
	private String tekstObjave;
	private ArrayList<Reaction> reactions;

	public Facebook(String imeiPrezime, String tekstObjave) {
		this.imeiPrezime = imeiPrezime;
		this.tekstObjave = tekstObjave;
		this.reactions = new ArrayList<Reaction>();
	}

	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}

	public String getImeiPrezime() {
		return imeiPrezime;
	}

	public void setTekstObjave(String tekstObjave) {
		this.tekstObjave = tekstObjave;
	}

	public String getTekstObjave() {
		return tekstObjave;
	}

	public ArrayList<Reaction> getReactions() {
		return reactions;
	}

	public void setReactions(Reaction a) {
		this.reactions.add(a);
	}

	private int prebrojavanje(String tipReakcije) {
		int brojac = 0;
		for (int i = 0; i < reactions.size(); i++) {
			if (reactions.get(i).getTipReakcije().equals(tipReakcije)) {
				brojac++;
			}
		}
		return brojac;
	}

	public void stampanje() {
		System.out.println(this.imeiPrezime);
		System.out.println(this.tekstObjave);
		System.out.println("Smajli " + prebrojavanje("Smajli") + " | Like " + prebrojavanje("Like") + " | Srce "
				+ prebrojavanje("Srce"));
	}

}
