package donguler;

import java.util.Scanner;

public class DoWhileUcunKati {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		int sayi = scanner.nextInt();
		do {
			if (sayi % 3 == 0) {
				System.out.println(sayi);
			}
			sayi--;			
		} while (sayi > 0);
	}
}