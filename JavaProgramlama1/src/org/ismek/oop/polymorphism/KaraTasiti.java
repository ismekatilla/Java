package org.ismek.oop.polymorphism;

public abstract class KaraTasiti extends Tasit implements FrenYapabilir, UyariSesiCikarabilir {

	String plaka;
	byte ayaktaYolcuSayisi;
	
	public KaraTasiti() {
		System.out.println("KARATAŞITI constructor çağrıldı.");
	}
}