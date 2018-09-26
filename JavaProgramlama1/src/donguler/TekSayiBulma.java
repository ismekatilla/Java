package donguler;

import java.util.Scanner;

public class TekSayiBulma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayý\t:");
		byte sayi = scanner.nextByte();
		for (int i = 0; i <= sayi; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		for (int i = 1; i <= sayi; i+=2) {
			System.out.println(i);
		}
	}

}
