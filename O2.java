package no.hvl.dat100;


import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O2 {

		public static void main(String[] args) {
			
			String askTxtORIG = "Skriv inn poengsum: ";
			String askTxt = askTxtORIG;
			
			for (int studenter = 0; studenter < 10; studenter++) {
			
				String poengTxt = showInputDialog(askTxt);
				askTxt = askTxtORIG;
				
				int poeng = 0;
				
				try {
					  poeng = parseInt(poengTxt);
				}
				catch(Exception feil) {
					if(poengTxt.length() == 0)
						return;
					askTxt = "Dette var ikke et tall prøv igjen: ";
					
					studenter--;
					continue;
				}
				
				if(poeng < 0 || poeng > 100) {
					askTxt = "Dette var en ugylding poengsum! Skriv inn på nytt: ";
					studenter--;
					continue;
				}
				
				int goesUpIn10 = poeng/10;
					
				char karakter = 'l';
				
				switch(goesUpIn10) {
					
				case 0:
				case 1:
				case 2:
				case 3:
					karakter = 'F';
					break;
				case 4:
					karakter = 'E';
					break;
				case 5:
					karakter = 'D';
					break;
				case 6:
				case 7:
					karakter = 'C';
					break;
				case 8:
					karakter = 'B';
					break;
				case 9:
				case 10:
					karakter = 'A';
					break;
				
				}
				
				System.out.println("Karakter: " + karakter);
	}	
	
}

}