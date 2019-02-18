package Rekursion;

public class Rekursion {

	public static void main(String[] args) {
	ausgabe1(1000);
	}

	public static void ausgabe1(int zahl) {
		// Das ist eine Rekursion
		// Das ist eine Abbruchbedingung
		if (zahl == 0)
			return;
		//
		zahl = zahl / 3;
	System.out.println(zahl);
	//
	ausgabe1(zahl);
	}


}
