package org.ismek.oop.calisan;

import java.util.Date;

public class Calisan {

	private String adSoyad;
	Date dogumTarihi;
	String telefon;
	double maas;
	
	public Calisan(String adiSoyadi) {
		adSoyad = adiSoyadi;
	}
	
	public String getAdSoyad() {
		return this.adSoyad;
	}
}