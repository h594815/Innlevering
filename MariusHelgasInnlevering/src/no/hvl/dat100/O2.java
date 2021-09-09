package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {
		
	for (int tall = 0; tall < 10; tall++) {
		
		String poengTxt = showInputDialog("poeng:");
		int poeng = Integer.parseInt(poengTxt);
		
		
if (poeng <= 39 && poeng >= 0) {
	
	System.out.println("Karakrer: F");
	
}else if (poeng >= 40  && poeng <= 49) {
	
	System.out.println("Karakter: E");
	
} else if (poeng >= 50 && poeng <= 59) {
	
	System.out.println("Karakter: D");
	
}else if (poeng >= 60 && poeng <= 79) {
	
	System.out.println("Karakter: C");
	
}else if (poeng >= 80 && poeng <= 89) {
	
	System.out.println("Karakter: B");
	
}else if (poeng >= 90 && poeng <= 100) {
		
		System.out.println( "Karakter: A");
		
	}else if (poeng < 0 || poeng> 100) {
		System.out.println("Error, poeng er ikkje mellom 0 og 100 poeng");
		tall--;
	}
	}
	}
}
