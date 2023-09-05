package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Login {

	public static void main(String[] args) { //static: slepp å skrive namnet på biblioteket forran kvar gong ein brukar ein metode derifrå, på same måte som PATH
		
		String brukernavn = showInputDialog("Brukernavn:"); //trykker cancel, så kjem verdien null
		
		String passord = showInputDialog("Passord:");
		
		System.out.println(brukernavn + " " + passord);

	}

}
