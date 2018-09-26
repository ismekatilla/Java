package methods;

import degiskenler.Ogrenci;
import kullanici.KullaniciOrnek;

public class MetodOrnek2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deger = 5;
		primitive(deger);
		deger++;
		System.out.println(deger);
		
		Integer referansInt = new Integer(12);
		referans(referansInt);
		System.out.println(referansInt);
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.numara = 52;
		classReferans(ogrenci);
		System.out.println(ogrenci.numara);
	}
	
	private static void primitive(int sayi) {
		sayi++;
	}
	
	private static void referans(Integer sayi) {
		sayi = new Integer(sayi.intValue() + 1);
	}
	
	private static void classReferans(Ogrenci ogrenci) {
		ogrenci.numara = 55;
	}

}
