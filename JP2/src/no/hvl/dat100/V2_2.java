package no.hvl.dat100;

import java.lang.Integer;
import javax.swing.JOptionPane;

public class V2_2 {

	public static void main(String[] args) {
		// les inn tre heiltal og skriv ut igjen sortert i stigane rekkefølge
		int v1 = Integer.parseInt(JOptionPane.showInputDialog("skriv inn eit heiltal"));
		int v2 = Integer.parseInt(JOptionPane.showInputDialog("skriv inn eit heiltal"));
		int v3 = Integer.parseInt(JOptionPane.showInputDialog("skriv inn eit heiltal"));
		
		// samanlikn og sortér
		if (v1 > v2) {
			if (v1 > v3) {
				v1 += v3;
				v3 = v1 - v3;
				v1 -= v3;
			} else {
				v1 += v2;
				v2 = v1 - v2;
				v1 -= v2;
			}
		}
		
		// skriv ut sorterte verdiar
		JOptionPane.showMessageDialog(null, "dei sorterte verdiane er:\n" + v1 + "\n" + v2 + "\n" + v3);
	}
}
