package dat100.hvl.no;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class LeseToNummer {
	

	public static void main(String[] args) {
		
		//INNDATA
		
		String melding = "skriv inn lengd av rektangelet: ";
		int input = parseInt(showInputDialog(null, melding));
		int verdi1 = input;
		
		melding = ("skriv inn breidd av rektangelet: ");
		input = parseInt(showInputDialog(null, melding));
		int verdi2 = input;
		
		//UTREKNING
		
		int sum = verdi1 * verdi2;
		
		//UTDATA
		
		melding = "Summen av tala er lik: " + sum;
		showMessageDialog(null, melding);
		
		
		
	}

}
