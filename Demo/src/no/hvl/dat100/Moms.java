package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Moms {
	
	public static void main (String[] args) {
		
		//input av beløp
		String belopTxt = showInputDialog("Beløp:");
				
		double belop = parseDouble(belopTxt);
		
		//beregne moms
		
		double moms = belop * 0.25;
		double totalpris = belop + moms;
		
		// skrive ut resultatet (total, moms)
		
		String utTxt = "Beløp:" + belop + "\nMoms:" + moms + "\nTotal:" + totalpris;
		showMessageDialog(null, utTxt);
	}

}
