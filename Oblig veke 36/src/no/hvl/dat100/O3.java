package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		// les inn heiltal større enn 0
		// rekn ut fakultet av heiltal
		// skriv ut på skjerm
		
		// hent data frå brukaren og sjekk at det er gyldig
		String melding = "Skriv eit heiltal større enn 0.";
		int tal = parseInt(showInputDialog(melding));
		
		while (tal <= 0) {
			showMessageDialog(null, "Talet må vere større enn 0!");
			tal = parseInt(showInputDialog(melding));
		}
			
		// utrekning
		int sum = 1;
		
		for (int i=2; i <= tal; i++) {
			sum *= i;
		}
		
		// vis data på skjerm
		showMessageDialog(null, tal + "! = " + sum);
	}
}
