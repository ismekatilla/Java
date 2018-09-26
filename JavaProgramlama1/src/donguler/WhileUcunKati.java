package donguler;

import java.util.Scanner;

public class WhileUcunKati {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		int sayi = scanner.nextInt();
		while (sayi > 0) {
			if (sayi % 3 == 0) {
				System.out.println(sayi);
			}
			sayi--;
		}
	}
}