package donguler;

import java.util.Scanner;

public class EkranaYildizYazdirma {

	/**
	 * Girilen sayı kadar satır oluşturan, her satırda da satır numarası kadar yıldız yazdıran program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz\t:");
		byte toplamYildizSayisi = scanner.nextByte();
		for (int satir = toplamYildizSayisi; satir > 0; satir--) {
			for (int sutun = 0; sutun < satir; sutun++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}