package org.ismek.oop.polymorphism;

public abstract class DemiryoluTasiti extends Tasit implements Yavaslayabilir, UyariSesiCikarabilir{

	private byte vagonSayisi;
	
	public DemiryoluTasiti() {
		System.out.println("DEMİRYOLUTAŞITI constructor çağrıldı.");
	}

	public byte getVagonSayisi() {
		return vagonSayisi;
	}

	public void setVagonSayisi(byte vagonSayisi) {
		this.vagonSayisi = vagonSayisi;
	}
}