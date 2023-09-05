package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG4 {

	public static void main(String[] args) {
		
		for (int i=0; i < 5; i++) {
		
			String tallTxt = showInputDialog("Gi et tall:");
			int tall = parseInt(tallTxt);
			System.out.println(tall);
			
		}
		
	}

}
