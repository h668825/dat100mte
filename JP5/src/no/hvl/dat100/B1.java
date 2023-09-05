package no.hvl.dat100;

public class B1 {

	public static void main(String[] args) {
		// skriv ut ein formatert tabell i konsollen med sin- og cos-verdiar for eit
		// array/tabell

		final int STEG_LENGDE = 5;

		skrivTabell(STEG_LENGDE);

		// System.out.println(gradTilRad(180));
	}

	public static void skrivTabell(int stegLengde) {
		// skriver ut heile tabellen med alle enkeltkomponentar
		skrivOverskrift();
		skrivTegn(70, '-');
		skrivVerdiar(stegLengde);
		skrivTegn(70, '-');
	}

	public static double[][] lagVerdiar(int stegLengde) {
		// fyll inn verdiar i tabell
		// rekn ut kor mange verdiar som er mellom 0-180 med steglengd
		// opprett int tabell med så mange steglengder og fyll inn
		// opprett 2d-tabell med doubles for rad, sin og cos
		// lag
		int antalSteg = 180 / stegLengde + 1;
		double[][] verdiar = new double[antalSteg][4];
		// fyll inn verdiar for grademål. start-/sluttpunkt er 0 og 180
		for (int i = 0; i < (antalSteg - 1); i++) {
			verdiar[i][0] = stegLengde * i;
		}
		verdiar[antalSteg-1][0] = 180;
		// skriv verdiar for radianar i første kolonne
		for (int i = 0; i < (antalSteg); i++) {
			verdiar[i][1] = gradTilRad((int) (verdiar[i][0]));
		}
		// skriv verdiar for sinus i andre kolonne
		for (int i = 0; i < (antalSteg); i++) {
			verdiar[i][2] = Math.sin(verdiar[i][1]);
		}
		// skriv verdiar for sinus i andre kolonne
		for (int i = 0; i < (antalSteg); i++) {
			verdiar[i][3] = Math.cos(verdiar[i][1]);
		}
		return verdiar;
	}

	public static void skrivVerdiar(int stegLengde) {
		double[][] verdiTabell = lagVerdiar(stegLengde);
		for (int i = 0; i < (verdiTabell.length); i++) {
			//System.out.print(i + ": ");
			System.out.print("\t" + (int)(verdiTabell[i][0]));
			
			for (int j = 1; j < (verdiTabell[0].length); j++) {
				//System.out.print(j + ", ");
				System.out.print("\t\t" + ((int)(verdiTabell[i][j]*100+0.5))/100.0);
			}
			System.out.println();
		}
	}

	public static void skrivOverskrift() {
		String melding = "\tx i grader\tx i radianer\tsin(x)\t\tcos(x)";
		System.out.println(melding);
	}

	public static double gradTilRad(int grader) {
		// rekn om radianar til grader
		return (grader * Math.PI) / 180;
	}

	public static void skrivTegn(int talTegn, char tegn) {
		// skriver ut linje med karakterar
		String utskrift = "";
		for (int i = 0; i < talTegn; i++) {
			utskrift = utskrift + tegn;
		}
		System.out.println(utskrift);
	}
}
