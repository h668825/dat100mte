package no.hvl.dat100;

public class B1 {

	public static void main(String[] args) {
		// Finn alle oddetal frå ei nedre til ei øvre grense
		
		int nedreGrense = 4;
		int øvreGrense = 11;
		// resultat: 5,7,9,11
		
		int tal = nedreGrense;
		
		if (tal % 2 == 0)
			tal++;
		
		while (tal <= øvreGrense) {
			System.out.println(tal);
			tal += 2;
		}
	}
}
