package basics;

public class EinMalEins {

	public static void main(String[] args) {
		System.out.println();
		for (int x = 1; x < 11; x++) {
			System.out.print(x + "er Reihe:\t");
			for (int j = 1; j < 11; j++) {
				System.out.print(x * j);
				System.out.print("\t");

			}
		}

	}

}
