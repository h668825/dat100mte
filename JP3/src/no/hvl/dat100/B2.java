package no.hvl.dat100;

public class B2 {

	public static void main(String[] args) {
		// eksponent ved hjelp av while-loop
		
		double x = 4.5;
		int n = 5;
		int reps = 0;
		
		double talFunksjon = Math.pow(x, n);
		double talWhile = 1.0;
		
		while (reps < n) {
			talWhile *= x;
			reps++;
		}
		
		System.out.println("med while-loop:	" + talWhile);
		System.out.println("med funksjon:	" + talFunksjon);
	}
}
