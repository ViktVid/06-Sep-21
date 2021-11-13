package novoGradivo;

public class GlavnaKlasa {
	public static void main(String[] args) {

		MotornoVozilo v1 = new MotornoVozilo(4, 4, "BG-001-AA");
		 v1.stampanje();

		Kamion k1 = new Kamion(2, 6, "PO-015-OS", 4, 2, "Tegljac");
		 k1.stampanje();

		Autobus a1 = new Autobus(2, 8, "AR-901-AR", 52, false, "Solo");
		 a1.stampanje();

		Prikolica p1 = new Prikolica(0, 2, "AA-010-ZR", 1, 1, "tegljac", "cisterna", "tvrda ruda", 1);
		p1.stampanje();

	}
}
