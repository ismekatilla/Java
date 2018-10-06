package odev;

import java.util.Scanner;

public class YildizdanKutuYapma {

	public static void main(String[] args) {
		yavas();
		hizli();
	}

	private static void yavas() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("\t*** Fatih Bilişim Okulu Yıldız Kutusu ***\t");
			System.out.println("\tBizi Tercih Ettiğiniz İçin Teşekkür Ederiz.\t");
			do {
				System.out.print("Kutu Çevresi İçin * Sayısı Giriniz\t:\t");
				int sayi = scanner.nextInt();
				
				for (int satir = 0; satir < sayi; satir++) {
					for (int sutun = 0; sutun < sayi; sutun++) {
						if (satir == 0 || sutun == 0 || satir == sayi - 1 || sutun == sayi - 1) {
							System.out.print("*\t");
						} else {
							System.out.print("\t");
						}
					}
					System.out.println("");
				}
				System.out.println();
			} while (true);
			
		} finally {
			scanner.close();
		}
	}
	
	public static void hizli() {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("\t*** Fatih Bilişim Okulu Yıldız Kutusu ***\t");
			System.out.println("\tBizi Tercih Ettiğiniz İçin Teşekkür Ederiz.\t");
			do {
				System.out.print("Kutu Çevresi İçin * Sayısı Giriniz\t:\t");
				int sayi = scanner.nextInt();
				
				for (int satir = 0; satir < sayi; satir++) {
					if (satir == 0 || satir == sayi -1) {
						for (int sutun = 0; sutun < sayi; sutun++) {
							System.out.print("*\t");
						}
					} else {
						for (int sutun = 0; sutun < sayi; sutun++) {
							if (sutun == 0 || sutun == sayi - 1) {
								System.out.print("*\t");
							} else {
								System.out.print("\t");
							}
						}
					}
					System.out.println("");
				}
			} while (true);
			
		} finally {
			scanner.close();
		}
	}
}

/*

0,0		0,1		0,2		0,3

1,0						1,3

2,0						2,3

3,0		3,1		3,2		3,3


*/