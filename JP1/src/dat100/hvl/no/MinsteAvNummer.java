package dat100.hvl.no;

import javax.swing.JOptionPane;
import static java.lang.Integer.*;
import java.lang.Math;

public class MinsteAvNummer {

	public static void main(String[] args) {
		
		// KONSTANTAR
		final int MENGD_TAL = 4; // fungerar kun med 2^x der x er heiltal
		
		// INNDATA
		int[] arr = new int[MENGD_TAL];
		String melding = "Skriv eit heiltal: ";
		int input;
		
		for (int i=0; i < MENGD_TAL; i++) {
			
			input = parseInt(JOptionPane.showInputDialog(null, melding));
			arr[i] = input;
			
		}
		
		// UTREKNING
		
		arr[0] = Math.min(arr[0], arr[1]);
		arr[1] = Math.min(arr[2], arr[3]);
		arr[0] = Math.min(arr[0], arr[1]);
		int minsteTal = arr[0];
		
		// UTDATA
		
		melding = "Det minste talet er: " + minsteTal;
		JOptionPane.showMessageDialog(null, melding);
		

	}

}
