package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class InputAreal {

	public static void main(String[] args) {

//		String breddeStr = showInputDialog("Bredde:");
//		int bredde = parseInt(breddeStr);
//
//		String hoydeStr = showInputDialog("Høyde:");
//		int hoyde = parseInt(hoydeStr);

		int bredde = lesInnTall("Bredde:");
		int hoyde = lesInnTall("Høyde:");
		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
	
	private static int lesInnTall(String message) {
		int output;
		
		String input = showInputDialog(message);
		output = parseInt(input);
		
		while (output < 0) {
			showMessageDialog(null, "Talet må vere positivt. Prøv igjen.");
			input = showInputDialog(message);
			output = parseInt(input);
		}
		return output;
	}
}
