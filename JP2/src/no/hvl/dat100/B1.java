package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import java.lang.Math;

public class B1 {

	public static void main(String[] args) {
		
		// INNDATA
		
		String melding  = "Skriv ein verdi for radius";
		int r = parseInt(showInputDialog(melding));
		
		// UTREKNING
		
		double volum = 4 / 3 * Math.PI * Math.pow(r, 3);
		volum = Math.round(volum);
		
		
		// UTDATA
		
		showMessageDialog(null, "Volumet er: " + volum);

	}

}
