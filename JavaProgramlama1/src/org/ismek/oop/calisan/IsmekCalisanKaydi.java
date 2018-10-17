package org.ismek.oop.calisan;

public class IsmekCalisanKaydi {

	public static void main(String[] args) {
		
		Calisan[] calisanlar = new Calisan[3];
		
		GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("GÜVENLİK1");
		System.out.println(guvenlikGorevlisi.getAdSoyad());
		guvenlikGorevlisi.silahiVar = true;
		System.out.println(guvenlikGorevlisi.getAdSoyad());
		
		TemizlikGorevlisi temizlikGorevlisi = new TemizlikGorevlisi("TEMİZLİK G1");
		temizlikGorevlisi.supurgesiVar = false;
		
		Brans brans = new Brans();
		brans.adi = "JAVA PROGRAMLAMA";
		brans.kodu = "001";
		brans.gun = EnumGun.PAZARTESI;
		
		Egitmen egitmen = new Egitmen("EĞİTMEN1");
		egitmen.maas = 1000d;
		
		calisanlar[0] = guvenlikGorevlisi;
		calisanlar[1] = temizlikGorevlisi;
		calisanlar[2] = egitmen;
		
		for (int i = 0; i < calisanlar.length; i++) {
			Calisan calisan = calisanlar[i];
			System.out.println(calisan.getAdSoyad());
		}
		
		
		
		
		
	}
}