package diziler;

import java.util.Scanner;

public class ArrayMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç sayı girilecek");
		int diziLength = scanner.nextInt();
		
		int[] dizi = new int[diziLength];
		for (int i = 0; i < dizi.length; i++) {
			System.out.print("Sayı Giriniz");
			int sayi = scanner.nextInt();
			dizi[i] = sayi;
		}
		
		int max = dizi[0];
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] > max) {
				max = dizi[i];
			}
		}
		System.out.println(max);
	}

}
