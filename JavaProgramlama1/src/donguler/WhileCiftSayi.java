package donguler;

import java.util.Scanner;

public class WhileCiftSayi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz:\t");
		int sayi = scanner.nextInt();
		boolean donguDevamEtsin = true;
		
		while (donguDevamEtsin) {
			if (sayi % 2 == 0) {
				System.out.println(sayi);
			}
			sayi--;
			if(sayi == -1) {
				//donguDevamEtsin = false;
				break;
			}
		}
	}

}
