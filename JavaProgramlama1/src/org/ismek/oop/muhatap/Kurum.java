package org.ismek.oop.muhatap;

public class Kurum extends Muhatap {

	public Kurum(String unvan, String vergiNo) {
		isim = unvan;
		no = vergiNo;
	}
	
	public void ilanReklamBeyaniYatir() {
		System.out.println("İlan Reklam Beyanı Yatırıldı.");
	}
	
	public void kurumYazdir() {
		System.out.println("Ben bir kurumum.");
	}
}
