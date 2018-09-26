package cases;

import java.util.Scanner;

public class IfMatchNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayı = ");
		int sayi1 = scanner.nextInt();
		
		System.out.print("2. sayı = ");
		int sayi2 = scanner.nextInt();
		
		System.out.print("3. sayı = ");
		int sayi3 = scanner.nextInt();
		
		if (sayi1 > 0 && sayi1 < 30) {
			if (sayi1 > 15 && sayi1 <30) {
				System.out.println(sayi1 + " 15 - 30 aralığındadır");
			}
		} else {
			System.out.println(sayi1 + " 0 - 30 aralığından değildir.");
		}
		
		if (sayi2 > 0 && sayi2 < 30) {
			if (sayi2 > 15 && sayi2 <30) {
				System.out.println(sayi2 + " 15 - 30 aralığındadır");
			}
		} else {
			System.out.println(sayi2 + " 0 - 30 aralığından değildir.");
		}
		
		if (sayi3 > 0 && sayi3 < 30) {
			if (sayi3 > 15 && sayi3 <30) {
				System.out.println(sayi3 + " 15 - 30 aralığındadır");
			}
		} else {
			System.out.println(sayi3 + " 0 - 30 aralığından değildir.");
		}
	}

}
