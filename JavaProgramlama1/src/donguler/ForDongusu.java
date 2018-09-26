package donguler;

import java.util.Scanner;

public class ForDongusu {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Faktoriyel Almak istediğiniz Sayı\t:\t");
		byte faktoriyelAlinacakSayi = scanner.nextByte();
		int sonuc = 1;
		for (byte donguBaslangic = 1; donguBaslangic <= faktoriyelAlinacakSayi; donguBaslangic++) {
			sonuc = sonuc * donguBaslangic;
		}
		System.out.println("SONUÇ = " + sonuc);
	}
}
/*
sonuc = 1 * 1 = 1;
sonuc = 1 * 2 = 2;
sonuc = 2 * 3 = 6;
*/