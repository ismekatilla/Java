package org.ismek.oop.sekil;

public class Kare extends Sekil implements CevresiHesaplanabilir {

	byte kenarUzunluk;
	
	public Kare() {
	}
	
	public Kare(byte kenarUzunluk) {
		this.kenarUzunluk = kenarUzunluk;
	}
	
	public int alan() {
		return kenarUzunluk * kenarUzunluk;
	}

	@Override
	public int cevresiniHesapla() {
		return kenarUzunluk * 4;
	}
}