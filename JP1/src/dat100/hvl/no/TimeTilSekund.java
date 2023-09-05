package dat100.hvl.no;

import javax.swing.JOptionPane;
import static java.lang.Integer.*;

public class TimeTilSekund {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// FUNKSJONSSKILDRING
		// les inn ein verdi i sekund og gjer om til timar, sekund, og minutt.
		//
		// algoritme:
		// sekund = rest av sekund inn delt på 60
		// minutt: konverterar til minutt ved å dele på 60 og tar deretter restdivisjon med 60
		// timar: floor-divisjon med 3600
		
		// KONSTANTAR
		
		final int SEKUND_I_MINUTTET = 60;
		final int MINUTT_I_TIMEN = 60;
		
		// INNDATA
		
		String melding;
		int input;
		
		melding = "Skriv inn ei tid oppgitt i sekund:";
		input = parseInt(JOptionPane.showInputDialog(null, melding));
		int sekundInn = input;
		
		// UTREKNING
		
		int timar, minutt, sekund;
		
		sekund = sekundInn % SEKUND_I_MINUTTET;
		minutt = (sekundInn / SEKUND_I_MINUTTET) % MINUTT_I_TIMEN;
		timar = (sekundInn / (SEKUND_I_MINUTTET * MINUTT_I_TIMEN));
		
		
//		int timar = 0, minutt = 0, sekund = 0;
//		
//		timar = sekundInn / (SEKUND_I_MINUTTET * MINUTT_I_TIMEN);
//		melding = "h" + timar + "m" + minutt + "s" + sekund;
//		System.out.println(melding);
//		
//		minutt = sekundInn / SEKUND_I_MINUTTET;
//		melding = "h" + timar + "m" + minutt + "s" + sekund;
//		System.out.println(melding);
//		
//		sekund = sekundInn - minutt * SEKUND_I_MINUTTET;
//		melding = "h" + timar + "m" + minutt + "s" + sekund;
//		System.out.println(melding);
//		
//		minutt -= timar * MINUTT_I_TIMEN;
//		melding = "h" + timar + "m" + minutt + "s" + sekund;
//		System.out.println(melding);
//		
		String formatertTid = timar + "h " + minutt + "m " + sekund + "s\n\n";
		
		// UTDATA
		
		melding = "tida i timar, minutt og sekund er:\n" + formatertTid;
		JOptionPane.showMessageDialog(null, melding);
		

	}

}
