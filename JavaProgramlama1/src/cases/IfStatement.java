package cases;

import java.util.Scanner;

public class IfStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. isim");
		String isim1 = scanner.next();
		
		System.out.print("2. isim");
		String isim2 = scanner.next();
		
		if(isim1.equals(isim2)) {
			System.out.println("Girilen isimler eşittir.");
		} else {
			System.out.println("Girilen isimler eşit değildir.");
		}
	}
}