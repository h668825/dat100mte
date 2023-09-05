package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.lang.easyGraphics.*;

public class Aritmetikk {

	public static void main(String[] args) {
		
		//summereInt();
		//minsteAvXTal();
		grafikkElns();
	
	}

	public static void grafikkElns() {
		
		
		
	}
	
	public static void minsteAvXTal() {
		
		
		// Inndata
		
		// KONSTANTAR
		final int ANTALL_INNDATA = 4;
		
		// ta input frå brukaren og lagre som array med. 
		// Kor mange variablar som skal oppgivast er gitt ved konstanten ANTALL_INNDATA
		int innTal;
		//int[] innData = new int[ANTALL_INNDATA];
		int[] innData = {3, 2, 6, 9, 10, 5, 20, 19, 6, 2, 11};
		
		/*for (int i = 0; i < ANTALL_INNDATA; i++) {
			
			String input = showInputDialog("Skriv inn heiltal nr:" + i);
			innTal = parseInt(input);
			innData[i] = innTal;
			
		} */
		
		// utrekning
		int length = innData.length;
		
		while (length != 0){
			
			// del lengda på array og rund opp dersom det er eit oddetal
			length = (length + 1) / 2;
			// "padding" for å hindre at verdiar frå tidlegare rundar skal komme med i samanlikning i nye rundar.
			innData[length] = 0;
			
			// for kvar andre verdi, køyr setninga
			for (int y = 0; y < (length-1); y++) {
				
				// samanlikn verdiar og sett den minste inn i arrayet.
				innData[y] = Math.min(innData[y*2], innData[y*2+1]);
			}
		}
		
			
		
		// utdata
		length = innData.length;
		
		for (int i = 0; i < length; i++) {
			
			System.out.println(innData[i]);
			
		}

	}
	
	public static void tverrSum() {
		
		// ta input frå brukaren og lagre som int
		String input = showInputDialog("Skriv inn heiltal:");
		int innTal = parseInt(input);
		
		// gjer utrekning
		
		// deklarer arbeidsvariablar
		int opprunda, nedrunda, siffer;
		int tverrSum = 0;
	
		while(innTal != 0) {
			
			// les av verdien til innTal før den blir endra.
			// del innTal med 10 for å redusere ein desimal og gang deretter opp igjen med ein ny variabel.
			opprunda = innTal; 
			innTal /= 10;
			nedrunda = innTal * 10;
			
			// finn differanse mellom avrunda og originalt tal.
			// legg differansen til tverrsummen.
			siffer = opprunda - nedrunda;
			tverrSum += siffer;
			
		}
		
		// vis summen på skjermen
		showMessageDialog(null, "tverrsummen er:\n" + tverrSum);

	}
	
	public static void arealSirkel() {
		
		// ta input frå brukaren og lagre som int
		String input = showInputDialog("Skriv inn radius:");
		int rad = parseInt(input);
		
		// gjer utrekning
		int area = (int)(pow(rad, 2)*PI);
		
		// vis summen på skjermen
		showMessageDialog(null, "Arealet av sirkelen er:\n" + area);

	}
		
	public static void arealRektangel() {
		
		// ta input frå brukaren og lagre som int
		String input = showInputDialog("Skriv inn lengd:");
		int len = parseInt(input);
		input = showInputDialog("Skriv inn breidd:");
		int wid = parseInt(input);
		
		// gjer utrekning
		int area = len*wid;
		
		// vis summen på skjermen
		showMessageDialog(null, "Arealet av rektangelet er:\n" + area);
		
	}
	
	public static void summereInt() {
		
		// ta input frå brukaren og lagre som int
		String input = showInputDialog("Skriv det første talet:");
		int int1 = parseInt(input);
		input = showInputDialog("Skriv det andre talet:");
		int int2 = parseInt(input);
		
		// gjer utrekning
		int finalInt = int1 + int2;
		
		// vis summen på skjermen
		showMessageDialog(null, finalInt);
		
	}
}
