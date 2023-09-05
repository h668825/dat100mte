package dat100.hvl.no;

import easygraphics.*;

public class prosentFordeling extends EasyGraphics{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		
		final int LENGTH = 8;
		final int HEIGHT = 8;
		final int BLOKK_SIZE = 40;
		
		boolean fyll = false, fyllFlip = false;
		
		makeWindow("Grafikk", BLOKK_SIZE * LENGTH, BLOKK_SIZE * HEIGHT);
		setColor(0, 0, 0);
		
		for (int y=0 ; y < HEIGHT ; y++) {
			for (int x=0 ; x < LENGTH ; x++) {
				if (fyll == true) {
					fillRectangle(x*BLOKK_SIZE, y*BLOKK_SIZE, BLOKK_SIZE, BLOKK_SIZE);
					
				}
				fyll = !fyll;
				
			}
			fyllFlip = !fyllFlip;
			fyll = fyllFlip;
			
		}
		
	}

}