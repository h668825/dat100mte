package no.hvl.dat100;

//JAVA-bok, kap 3, oppgave 13

// lag eit program som teiknar ein murvegg
// annakvar rad startar med ein halv murstein
// konsts: bredde, høgde, mursteinbredde, mursteinhøgde, margin venstre, margin høgre

// teikn-murstein - to linjer frå bot-left -> bot-right 
// og bot-right til top-right
// tar inn 

// teikn rad og rekker - while loop, sjekk når bot

// teikn kant - teikn rektangel rundt muren. Ta omsyn til margin

import easygraphics.*;

public class B3 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		// Konsts
		final int HOYDE = 200, BREDDE = 500;
		final int V_MARG = 20, H_MARG = 20;
		int winHeight = HOYDE + 2 * V_MARG;
		int winWidth = BREDDE + 2 * H_MARG;
		
		makeWindow("Tittel", winWidth, winHeight);
		setColor(0, 0, 0);
		drawRectangle(H_MARG, V_MARG, BREDDE, HOYDE);
		tegnRad(H_MARG, V_MARG, BREDDE, HOYDE);
		
	}
	
	public void tegnRad(int hMarg, int vMarg, int bredde, int hoyde) {
		int mstnHoyde = 25, mstnBredde = 30;
		
		int xOffset;
		int yOffset = vMarg;
		
		while (yOffset < hoyde + vMarg) {
			int yDelta = yOffset - hoyde + vMarg;
			if (yDelta > 0)
				mstnHoyde = yDelta;
			
			xOffset = hMarg;
			while (xOffset < bredde + hMarg) {
				int xDelta = xOffset - bredde + hMarg;
				if (xDelta > 0)
					mstnBredde = xDelta;
				drawRectangle(xOffset, yOffset, mstnBredde, mstnHoyde);
				System.out.println(yOffset);
				xOffset += mstnBredde;
			}
			yOffset += mstnHoyde;
			
		}
	}
}
