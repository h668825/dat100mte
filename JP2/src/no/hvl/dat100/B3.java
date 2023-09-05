package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B3 {

	public static void main(String[] args) {

		String korrektBrukernavn = "finn";
		String korrektPassord = "karantene";

		String brukernavn = showInputDialog("Brukernavn:");

		String passord = showInputDialog("Passord:");

		if (brukernavn.equals(korrektBrukernavn) && passord.equals(korrektPassord)) {
			showMessageDialog(null, "legitimasjon er korrekt,");
		} else {
			showMessageDialog(null, "legitimasjon er feil.");
		}

//		System.out.println(brukernavn);
//		System.out.println(passord);

	}

}