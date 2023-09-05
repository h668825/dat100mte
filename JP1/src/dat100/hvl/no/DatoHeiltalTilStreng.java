package dat100.hvl.no;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class DatoHeiltalTilStreng {

	public static void main(String[] args) {
		
		// KONSTANTAR
		
		// INNDATA
		String melding;
		int input;
		
		melding = "Skriv inn dagnummer: ";
		input = parseInt(JOptionPane.showInputDialog(null, melding));
		int dagNr = input;
		
		melding = "Skriv inn månadsnummer: ";
		input = parseInt(JOptionPane.showInputDialog(null, melding));
		int mndNr = input;
		
		melding = "Skriv inn årstal: ";
		input = parseInt(JOptionPane.showInputDialog(null, melding));
		int yrNr = input;
		
		// UTREKNING
		
		String dato = dagNr + "." + mndNr + "." + yrNr;
		
		
		// UTDATA
		
		melding = "Datoen er: " + dato;
		JOptionPane.showMessageDialog(null, melding);

	}

}
