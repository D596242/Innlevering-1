package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		String heltallTxt = showInputDialog("Skriv inn et tall: ");
		long heltall = parseInt(heltallTxt);
		
		long n = heltall;
		
		long a = n;
		long x = 1;
		
		while (n > 0) {
			x*=n;
			n--;
		}
		System.out.println(a + "! = " + x);
		
	}

}
