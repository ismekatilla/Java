package org.ismek.oop.polymorphism;

public class Tren extends DemiryoluTasiti {

	boolean yatakli;
	EnumTrenTuru trenTuru;
	
	public Tren() {
		System.out.println("TREN constructor çağrıldı.");
	}
	
	@Override
	public void hareketEt() {
		System.out.println("Tren Hareket ETTİ.");
	}

	@Override
	public void uyariSesiCikar() {
		System.out.println("ÇUF ÇUF ÇUUUUFFFF");
	}
	
	@Override
	public void yavasla() {
		System.out.println("Tren YAVAŞLADI");
	}
}