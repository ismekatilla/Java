package org.ismek.oop.polymorphism;

public class Otobus extends KaraTasiti {

	boolean tekKat;
	
	public Otobus() {
		System.out.println("OTOBÜS constructor çağrıldı.");
	}
	
	@Override
	public void hareketEt() {
		System.out.println("Otobüs Hareket ETTİ.");
	}

	@Override
	public void frenYap() {
		System.out.println("OTOBÜS Fren YAPTI");
	}

	@Override
	public void uyariSesiCikar() {
		System.out.println("DÜT DÜT DÜÜÜÜTT");
	}
}