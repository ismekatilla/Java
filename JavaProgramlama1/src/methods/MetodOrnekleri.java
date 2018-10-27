package methods;

import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

public class MetodOrnekleri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ekranaYaziYazdir();
//		String paketAdi = getPaketAdi();
//		System.out.println(paketAdi);
//		
//		System.out.println(getPaketAdi());
//		
//		adSoyadYazdir("ALİ", "VELİ");
//		
//		System.out.println("ADI NEDİR = ");
//		Scanner scanner = new Scanner(System.in);
//		String adi = scanner.next();
//		
//		System.out.println("SOYADI NEDİR = ");
//		String soyadi = scanner.next();
//		adSoyadYazdir(adi, soyadi);
//		
//		// ALT + SHIFT + R
//		int carpimSonucu = carpim(4, 8);
//		System.out.println(carpimSonucu);
//		
//		System.out.println("SAYI 1 = ");
//		int sayi1 = scanner.nextInt();
//		
//		System.out.println("SAYI 2 = ");
//		int sayi2 = scanner.nextInt();
//		System.out.println(carpim(sayi1, sayi2));
//		
//		
//		String isim = "EBRU";
//		char charAt = isim.charAt(0);
//		
//		int length = isim.length();

		Scanner scanner = new Scanner(System.in);
		String deger = scanner.next();
		int degerUzunluk = deger.length();
		String sonuc = "";
		for (int i = degerUzunluk - 1; i >= 0; i--) {
			sonuc = sonuc + deger.charAt(i);
		}
		System.out.println(sonuc);
	}
	
	// 1
	private static void ekranaYaziYazdir() {
		System.out.println("ALİ VELİ");
	}
	
	// 2
	private static String getPaketAdi() {
		Paket paket = new Paket();
		return paket.adi;
	}
	
	// 3
	static void adSoyadYazdir(String ad, String soyad) {
		System.out.println(ad + " " + soyad);
	}
	
	// 4
	static int carpim(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
	
}
