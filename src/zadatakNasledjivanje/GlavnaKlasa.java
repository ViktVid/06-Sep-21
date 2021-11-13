package zadatakNasledjivanje;

import zadatakNasledjivanje.Racunar;
import zadatakNasledjivanje.Software;
import zadatakNasledjivanje.Hardware;
import zadatakNasledjivanje.Monitor;

public class GlavnaKlasa {

	public static void main(String[] args) {

		Racunar r = new Racunar("Laptop", 87000, true);
		 r.stampanje();

		Software s = new Software("Neki tip software-a", 20000, true, "Software neki", false, 10000);
		 s.stampanje();

		Hardware h = new Hardware("Tastatura", 5000, false, "Neki naziv", 4699, false);
		 h.stampanje();

		 Monitor m = new Monitor("Naziv", 15000, false, 32, null, 14000);
		m.stampanje();
		
		
	}

}
