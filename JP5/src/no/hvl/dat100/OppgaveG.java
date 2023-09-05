package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveG {

	public static void main(String[] args) {
		// a)
		int[] tabell = { 1, 3, 4, 7, 9, 10 };
		
		int[] tabellMotsatt = skiftFortegn(tabell);
		skrivUt(tabellMotsatt);
//		// b)
//		System.out.println(tabell[2]);
//		// c)
//		tabell[2] = 7;
//		// d)
//		for (int i = 0; i < tabell.length; i++) {
//			System.out.println(tabell[i]);
//		}
//		
//		int tallEgVilFinne = 7;
//		
//		String melding = "" + finnes(tabell, tallEgVilFinne);
//		JOptionPane.showMessageDialog(null, melding);
		
	}

	// e)
	public static void skrivUt(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
	// g)
	public static boolean finnes(int[] tabell, int tall) {
		// true dersom int finnast i tabell
		// false ellers
		int i = 0;
		while (true) {
			if (tabell[i] == tall) {
				return true;
			}
			if (i == tabell.length - 1) {
				return false;
			}
			i++;
		}
		
	}

	public static int[] skiftFortegn(int[] tabell) {
		// true dersom int finnast i tabell
		// false ellers
		for (int i = 0; i < tabell.length; i++) {
			tabell[i] = -tabell[i];
		}
		return tabell;
	}
	
	

}