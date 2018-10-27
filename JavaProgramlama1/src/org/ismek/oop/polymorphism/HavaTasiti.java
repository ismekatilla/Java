package org.ismek.oop.polymorphism;

public class HavaTasiti extends Tasit implements Ucabilir {

	private byte motorSayisi;

	public byte getMotorSayisi() {
		return motorSayisi;
	}

	public void setMotorSayisi(byte motorSayisi) {
		this.motorSayisi = motorSayisi;
	}

	@Override
	public void uc() {
		System.out.println("HAVA TAŞITI UÇUYOR");
	}
}