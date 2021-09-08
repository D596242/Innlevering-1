package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		String bruttoTxt = showInputDialog("Bruttoinntekt: ");
	    
		int bruttoinntekt = parseInt(bruttoTxt);
		double skatt1 = 0.0;
		double trinnskatt1 = bruttoinntekt * skatt1;
		double skatt2 = 0.017;
		double trinnskatt2 = bruttoinntekt * skatt2; 
		double skatt3 = 0.040;
		double trinnskatt3 = bruttoinntekt * skatt3;
		double skatt4 = 0.132;
		double trinnskatt4 = bruttoinntekt * skatt4;
		double skatt5 = 0.162;
		double trinnskatt5 = bruttoinntekt * skatt5;
		
		
		if (bruttoinntekt > 0 && bruttoinntekt <= 184800) {
			System.out.println("Trinnskatten er: " + trinnskatt1); 
		} else if (bruttoinntekt > 184800 && bruttoinntekt <= 260100) { 
			System.out.println("Trinnskatten er: " + trinnskatt2);
		} else if (bruttoinntekt > 260100 && bruttoinntekt <= 651250) {
			System.out.println("Trinnskatten er: " + trinnskatt3);
		} else if (bruttoinntekt > 651250 && bruttoinntekt <= 1021550) {
			System.out.println("Trinnsaktten er: " + trinnskatt4); 
		} else if (bruttoinntekt > 1021550) {
			System.out.println("Trinnskatten er: " + trinnskatt5); 
		} 
		
	}

}

