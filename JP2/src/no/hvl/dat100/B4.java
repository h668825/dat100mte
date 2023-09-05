package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class B4 {

	public static void main(String[] args) {
		
		// INNDATA
		
		String melding  = "Skriv inn årsløn";
		int lonn = parseInt(showInputDialog(melding));
		
		// UTREKNING
		
		// deklarasjonar 
		int t0Tak = 164100;
		int t1Tak = 235950;
		int t2Tak = 580650;
		int t3Tak = 934050;
		double sats1 = 0.93;
		double sats2 = 2.41;
		double sats3 = 11.52;
		double sats4 = 14.52;
		
		double trinnSkatt = 0;
		
		// sjå om lønn er høgare enn terskel
		if (lonn > t3Tak) {
			
			trinnSkatt = sats4 * lonn / 100;
		
		} else if (lonn > t2Tak) {
		
			trinnSkatt = sats3 * lonn / 100;
		
		} else if (lonn > t1Tak) {
		
			trinnSkatt = sats2 * lonn / 100;
		
		} else if (lonn > t0Tak) {
		
			trinnSkatt = sats1 * lonn / 100;
		
		}
		
		// UTDATA
		
		showMessageDialog(null, "skattepliktig beløp er: " + trinnSkatt);

	}

}
