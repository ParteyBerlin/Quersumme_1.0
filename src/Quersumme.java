import java.util.*;

public class Quersumme {

	public static void main(String[] args) 
	{
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Quersumme berechnen");
	System.out.println("\nZahl eingeben: ");
	int zahl = scn.nextInt();
	/**
	 *   (I) Mittels Modulo 10 der eingegebenen Zahl wird die Einer-Stelle der Zahl ermittelt und in der Variablen mod abgelegt
	 *  (II) Anschließend wird die Einer-Stelle von der urpsrünglichen Zahl abgezogen, sodaß diese Zahl auf 0 endet.
	 * (III) Dann wird diese zahl durch 10 geteilt, um die Null zu tilgen.
	 *  (IV) Nun befindet dich die 10er-Stelle der ursprünglichen Zahl an der Einer-Stelle der neuen Zahl und es kann mit (I) 
	 *  	 von vorn begonnen werden (while-Schleife).
	 *   (V) Die Schleife stoppt, sobald zahl kleiner 10 ist
	 */
	int a = 0;
	while(zahl >= 10)
	{
		int mod = zahl % 10;
		zahl = zahl - mod;
		zahl = zahl / 10;
		a = a + mod;
	}
	a = a + zahl;
	System.out.println("\n\nQuersumme der eingegeben Zahl: " + a);
		

	}

}
