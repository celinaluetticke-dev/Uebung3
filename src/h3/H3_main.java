package h3;

public class H3_main {
	public static void main(String[] args) {

		int max = 5;
		int fix = 2;
		int wartend = 2;
		boolean istVoll = true;

		int frei = max - fix;

		if (frei > 0 && wartend > 0) {
			if (wartend > frei) {
				wartend = wartend - frei;
				fix = fix + frei;
			} else if (wartend < frei) {
				fix = fix + wartend;
				wartend = 0;
			} else { // wartend == frei (geht auch mit else if)
				wartend = 0;
				fix = max;

			}
		}

		if (fix >= max) {
			istVoll = true;
		} else {
			istVoll = false;
		}

		System.out.println("maximale Kapazitaet = " + max);
		System.out.println("zugewiesene Fixplaetze = " + fix);
		System.out.println("Wartende = " + wartend);
		System.out.println("istVoll = " + istVoll);
	}
}
