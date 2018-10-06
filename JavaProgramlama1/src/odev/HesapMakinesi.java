package odev;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t*** Fatih Bilişim Okulu Hesap Makinesi ***\t");
		System.out.println("\tBizi Tercih Ettiğiniz İçin Teşekkür Ederiz.\t");
		do {
			System.out.println("(1) Çarpma");
			System.out.println("(2) Bölme");
			System.out.println("(3) Toplama");
			System.out.println("(4) Çıkarma");
			
			System.out.print("Yapmak istediğiniz işlemi seçiniz\t:\t");
			int secim = scanner.nextInt();
			
			System.out.print("1. Sayıyı Giriniz\t\t\t:\t");
			float sayi1 = scanner.nextFloat();
			
			System.out.print("2. Sayıyı Giriniz\t\t\t:\t");
			float sayi2 = scanner.nextFloat();
			
			float sonuc = 0;
			
			switch (secim) {
			case 1:
				sonuc = sayi1 * sayi2;
				break;
			case 2:
				sonuc = sayi1 / sayi2;
				break;
			case 3:
				sonuc = sayi1 + sayi2;
				break;
			case 4:
				sonuc = sayi1 - sayi2;
				break;
			default:
				System.out.println("İşlem seçmediniz");
				break;
			}
			
			String formattedSonuc = String.format("%.2f", sonuc);
			System.out.println("Sonuç\t\t\t\t\t:\t" + formattedSonuc);
			
			System.out.println("Çıkış yapmak için Hayır(H). Devam etmek için başka bir tuşa basınız.");
			
			String devamHarfi = scanner.next();
			if ("H".equals(devamHarfi.toUpperCase())) {
				break;
			}
		} while (true);
	}
}