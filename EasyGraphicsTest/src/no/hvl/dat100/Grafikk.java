package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		
		makeWindow("Grafikk", 350, 400);
		for (int i=0; i<=1; i++) {
			
			drawCircle(150, 70+i*120, 60);
		}
		
	}

}
