package odev.kullanicimodul;

import java.util.Scanner;

public class KullaniciModul {

	static Kullanici[] kullaniciArray;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. Kaydetme");
		System.out.println("2. Yazdırma");
		System.out.println("3. Arama");
		do {
			System.out.println("Yapmak istediğiniz işlemi giriniz:\t");
			Scanner scanner = new Scanner(System.in);
			byte secim = scanner.nextByte();
			switch (secim) {
			case 1:
				kaydetmeIsleminiYap();
				break;
			case 2: 
				kullanicilariYazdir();
				break;
			case 3:
				aramaIslemiYap();
				break;
			default:
				break;
			}
		} while (true);
	}
	
	static void kaydetmeIsleminiYap(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaydetmek istediğiniz kişi sayısı =\t");
		int kaydedilecekKisiSayisi = scanner.nextInt();
		kullaniciArray = new Kullanici[kaydedilecekKisiSayisi];
		
		for (int i = 0; i < kaydedilecekKisiSayisi; i++) {
			System.out.print(i + ". Kişi Ad =\t");
			String ad = scanner.next();
			
			System.out.print(i + ". Kişi Soyad =\t");
			String soyad = scanner.next();
			
			System.out.print(i + ". Kişi No =\t");
			String no = scanner.next();
			
			Kullanici kullanici = new Kullanici();
			kullanici.ad = ad;
			kullanici.soyad = soyad;
			kullanici.no = no;
			
			kullaniciArray[i] = kullanici;
			System.out.println();
		}
	}

	static void kullanicilariYazdir() {
		for (int i = 0; i < kullaniciArray.length; i++) {
			Kullanici k = kullaniciArray[i];
			System.out.println(k.ad);
		}
	}
	
	static void aramaIslemiYap() {
		System.out.println("Aramak istediğiniz telefon =\t");
		Scanner scanner = new Scanner(System.in);
		String aranacakNumara = scanner.next();
		
		for (int i = 0; i < kullaniciArray.length; i++) {
			Kullanici k = kullaniciArray[i];
			if (k.no.equals(aranacakNumara)) {
				System.out.println("Aranan Kişi " + k.ad);
				break;
			}
		}
	}
}