package h1;

public class H1_main {
	public static void main(String[] args) {

		double guthaben = -100.0;

		double GuthabenBetrag;
		if (guthaben < 0) {
			GuthabenBetrag = -guthaben;
		} else {
			GuthabenBetrag = guthaben;
		}

		double monEingang = 200.0;
		int rating = -2;
		boolean warnhinweis = false;
		boolean negativ = false;

		int status;
		if (guthaben < 0) {
			status = -1;
		} else if (guthaben == 0) {
			status = 0;
		} else {
			status = 1;
		}

		switch (status) {
		case 1:
			rating = rating + 3;
			break;

		case 0:
			rating = rating + 2;
			break;

		case -1:
			if (monEingang >= GuthabenBetrag) {
				rating = rating + 1;
			} else {
				rating = rating - 1;
			}
			break;

		}
		if (guthaben < 0) {
			negativ = true;
		} else {

		}

		if ((guthaben < 0) && (monEingang < GuthabenBetrag) && (rating < 0)) {
			warnhinweis = true;
		} else {

		}

		System.out.println("Guthaben = " + guthaben);
		System.out.println("monatlicher Eingang = " + monEingang);
		System.out.println("Rating = " + rating);
		System.out.println("negativ = " + negativ);
		System.out.println("Warnhinweis = " + warnhinweis);

	}
}
