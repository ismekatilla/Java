package diziler;

import java.util.Scanner;

public class MathKutuphanesi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		
		String sayiAsStr = String.valueOf(sayi);
		int sayiLength = sayiAsStr.length();
		
		String[] dizi = new String[sayiLength];
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = sayiAsStr.substring(i, i + 1);
			System.out.println(dizi[i]);
		}
	}
}