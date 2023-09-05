package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG3 {

	public static void main(String[] args) {
		// INNDATA
		
		int a = parseInt(showInputDialog("skriv ein verdi for a"));
		int b = parseInt(showInputDialog("skriv ein verdi for b"));
		
		//UTDATA
		
		if (b != 0) {
			
			// dersom b ikkje er null, gjer divisjon og skriv ut resultat
			int tal = a/b;
			showMessageDialog(null, "a / b gir verdien: " + tal);
		
		} else {
			
			// skriv ut feilmelding
			showMessageDialog(null, "Feil: b kan ikkje vere lik 0");
		
		}

	}

}
