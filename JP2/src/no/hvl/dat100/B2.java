package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class B2 {

	public static void main(String[] args) {
		
		// INNDATA
		
		int pris = parseInt(showInputDialog("skriv inn prisen på varen"));
		int belop = parseInt(showInputDialog("skriv inn beløpet som er betalt"));
	
		// UTREKNING
		
		int ant10kr, ant1kr, rest;
		
		rest = belop - pris;
		ant10kr = rest / 10;
		ant1kr = rest - ant10kr * 10;
		
		// UTDATA
		
		String melding = "restbeløpet gis ved " + ant10kr + " tikroning og " + ant1kr + " énkroning.";
		showMessageDialog(null, melding);
			
	}
}
