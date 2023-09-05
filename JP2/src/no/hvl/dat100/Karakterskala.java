package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterskala {

	public static void main( String[] args) {
		
		//INNDATA
		int poengSum;
		String melding = "skriv inn poengsum som eit nummer mellom 0 og 100: ";
		
		do {
			poengSum = parseInt(showInputDialog(melding));
		} while (100 <= poengSum || poengSum <= 0);
		
		
		
		//UTREKNING
		
		//UTDATA
	}
	
}
