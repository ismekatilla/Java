package org.ismek.oop.muhatap;

public class Vatandas extends Muhatap {

	public Vatandas(String adSoyad, String tcKimlikNo) {
		isim = adSoyad;
		no = tcKimlikNo;
	}
	
	public void cevreTemizlikVergisiYatir() {
		System.out.println("Çevre Temizlik Vergisi Yatırıldı");
	}
	
	public void vatandasYazdir() {
		System.out.println("Ben bir vatandaşım");
	}
}