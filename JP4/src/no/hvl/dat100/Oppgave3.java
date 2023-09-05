package no.hvl.dat100;

import easygraphics.*;
import javax.swing.JOptionPane;

public class Oppgave3 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		//teiknLinjeDiagram(20, 20, 200, 200, 0.35, "Abcde");
		
		final double[] ANDELAR = {
				0.35, 0.18, 0.57, 0.98, 0.57, 
				0.38, 0.87, 0.35, 0.58
								  };
		final String[] TITLAR = {"F", "A", "E", "N", "T", "A", "D", "E", "G"};
		final String VENSTRE_TITTEL = "Guttar";
		final String HØGRE_TITTEL = "Jenter";
		
		if (TITLAR.length != ANDELAR.length) {
			JOptionPane.showMessageDialog(null, "Feil: skilnad på tal element i TITLAR og ANDELAR.");
			return;
		}
		
		makeWindow("LinjeDiagram", 340, 40 + ANDELAR.length*90);
		diagramRekke(ANDELAR, TITLAR, VENSTRE_TITTEL, HØGRE_TITTEL);
		
		
	}
	
	public void diagramRekke(double[] andelar, String[] titlar, String venstreTittel, String høgreTittel) {
		for (int i=0; i < andelar.length; i++) {
			drawString(venstreTittel, 20, 35);
			drawString(høgreTittel, 20 + 300 - 50, 35);
			teiknLinjeDiagram(20, 40 + i*90, 50, 300, andelar[i], titlar[i]);
		}

	}
	
	
	public void teiknLinjeDiagram(
			int x, int y, int høgd, int breidd, 
			double andel, String tittel) {
		// fyll raud bakgrunn
		setColor(255, 0, 0); // raud
	    fillRectangle(x, y, breidd, høgd);
		
	    // teikn det grøne rektangelet til venstre for prosentskiljet
		int lengdGrøn = (int)(breidd * andel + 0.5);
	    setColor(0, 255, 0); // grøn
	    fillRectangle(x, y, lengdGrøn, høgd);
	    
	    // teikn ein svart kant rundt diagrammet
	    setColor(0, 0, 0);
	    drawRectangle(x, y, breidd, høgd);
	    
	    // teikn tekst for diagrammet
	    String prosentVenstre = (int)(andel*100) + "%";
	    String prosentHøgre = (int)((1.0-andel)*100) + "%";
	    
	    drawString(prosentVenstre, x, y + høgd + 15);
	    drawString(prosentHøgre, breidd - 10, y + høgd + 15);
	    drawString(tittel, x + breidd / 2 - 5, y - 5);
	}
}

