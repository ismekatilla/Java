package donguler;

import java.util.Scanner;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			Scanner scanner = new Scanner(System.in);
			int girilenSayi = scanner.nextInt();
			if (girilenSayi > 5) {
				break;
			}
		} while (true);
		System.out.println("ÇIKIŞ");
	}

}
