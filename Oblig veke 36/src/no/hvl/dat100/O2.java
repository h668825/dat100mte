package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		final int ANT_STUDENTAR = 10;
		
		for (int i=1; i <= ANT_STUDENTAR; i++) {
		
			//INNDATA
			
			String melding = "skriv inn poengsum som eit nummer frå og med 0 til og med 100:\n student nr.: " + i;
			
			// gjenta etterspørsel fram til brukar skriver eit gyldig tal
			int poengSum = parseInt(showInputDialog(melding));
			
			while (poengSum > 100 || poengSum < 0) {
				showMessageDialog(null, "ugyldig poengsum!");
				poengSum = parseInt(showInputDialog(melding));
			} 
			
			//UTREKNING
			
			int talSkala = poengSum/ 10;
			char karakter = 'F';
			
			switch (talSkala) {
				
			case 10:
			case 9:
				karakter = 'A';
			break;
			
			case 8:
				karakter = 'B';
			break;
			
			case 7:
			case 6:
				karakter = 'C';
			break;
			
			case 5:
				karakter = 'D';
			break;
			
			case 4:
				karakter = 'E';
			break;
		
			}
			
			//UTDATA
			
			showMessageDialog(null, "bokstavkarakteren er: " + karakter);
		}
	
	}

}
