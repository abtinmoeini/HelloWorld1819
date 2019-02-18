package Bubblesort;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zahlen = { 3, 6, 1, 9, 2, 5 };
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
			
			;
			
		} System.out.println("--------------");
		

		for (int n = zahlen.length; n > 1; n--) {
			for (int i = 0; i < n-1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					// A.swap(i, i+1)
					int help = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = help;
				}
			}
		}
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
	}
}