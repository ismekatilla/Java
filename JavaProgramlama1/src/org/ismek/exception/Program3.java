package org.ismek.exception;

import java.util.Scanner;

public class Program3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] sayilar = getSayilar();
		
		do {
			System.out.print("1. Sayı =\t");
			int sayi1 = scanner.nextInt();
			
			System.out.print("2. Sayı =\t");
			int sayi2 = scanner.nextInt();

			try {
				int sonuc = sayi1 / sayi2;
				System.out.println("Bölüm sonucu = " + sonuc);
				
				int indisDegeri = sayilar[sonuc];
				System.out.println("Dizideki değeri " + sayilar[indisDegeri]);
			} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Girmiş olduğunuz sayıları kontrol ediniz");
			}
		} while (true);
	}

	public static int[] getSayilar() {
		int[] sayilar = new int[100];
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = i+1;
		}
		return sayilar;
	}
}
