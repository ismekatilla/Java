package org.ismek.oop.kedigil;

public class Kopek extends Hayvan {

	public Kopek() {
		
	}
	
	public Kopek(int boyu, String cinsiyeti, int kilosu, int tanimlananHiz) {
		boy = boyu;
		kilo = kilosu;
		cinsiyet = cinsiyeti;
		hiz = tanimlananHiz;
	}
	
	public void havla() {
		System.out.println("HAV HAV HAV");
	}
}