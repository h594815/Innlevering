package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		String lonnTxt = showInputDialog("Lønn:");
		int lonn = Integer.parseInt(lonnTxt);
		
		double skatt= 0;
if (lonn < 164100) {
	System.out.println("Du trenger ikkje å skatte på lønnen");
}else if (lonn > 164100 && lonn < 230950) {
	skatt = 0.0093;
	double sum = skatt*lonn;
	System.out.println(" Du må skatte 0,93%, som er:" + " " + sum);
} else if (lonn > 230950 && lonn < 580650) {
	skatt = 0.0241;
	double sum = skatt*lonn;
	System.out.println("Du må skatte 2,41%, som er:" + " " + sum);
}else if (lonn > 580650 && lonn < 934050) {
	skatt = 0.1152;
	double sum = skatt*lonn;
	System.out.println("Du må skatte 11,52%, som er" + " " + sum);
}else  {
	skatt = 0.1452;
	double sum = skatt*lonn;
		System.out.println("Du må skatte 14,52%, som er" + " " + sum);
	}
	}

}
