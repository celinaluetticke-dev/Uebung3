package p1;

public class P1_main {
	public static void main(String[] args) {
		int wuerfel = 4;
		
		boolean gewonnen = (wuerfel == 1) || (wuerfel == 4);
		boolean verloren = (wuerfel == 2);
		boolean unentschieden = (wuerfel == 5);
		
		if (gewonnen) {
			System.out.println("Gewonnen");
		} else if (verloren) {
			System.out.println("Verloren");
		} else if (unentschieden) {
			System.out.println("Unentschieden");
		} else {
			System.out.println("Lage unklar");
		}
	}

}
