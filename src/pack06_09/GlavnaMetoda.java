package pack06_09;

public class GlavnaMetoda {
	public static void main(String[] args) {

		Reaction r1 = new Reaction("Smajli", "Petar Petrovic");
		Reaction r2 = new Reaction("Smajlic", "Pera Kojot");
		Reaction r3 = new Reaction("Srce", "Ptica Trkacica");
		Reaction r4 = new Reaction("Like", " ");
		Reaction r5 = new Reaction("Like", "Djodje");

		Facebook f1 = new Facebook("Nikola Jokic", "Oce neko na basket..");
		f1.setReactions(r1);
		f1.setReactions(r2);
		f1.setReactions(r3);
		f1.setReactions(r4);
		f1.setReactions(r5);
		f1.stampanje();

	}

}
