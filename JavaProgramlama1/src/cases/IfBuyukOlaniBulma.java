package cases;

import java.util.Scanner;

public class IfBuyukOlaniBulma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayi = ");
		int sayi1 = scanner.nextInt();
		
		System.out.print("2. sayi = ");
		int sayi2 = scanner.nextInt();
		
		boolean sayi1BuyukSayi2 = sayi1 > sayi2;
		if(sayi1BuyukSayi2 || sayi1 == 100) {
			System.out.println(sayi1 + " > " + sayi2);
		} else {
			System.out.println(sayi2 + " > " + sayi1);
		}
	}

}
