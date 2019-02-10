package org.ismek.java.ders1.initializer;

public class Initializer {
	
	private final int sayi;
	
	public Initializer() {
		System.out.println(sayi + "Constructor a girildi.");
	}
	
	{
		sayi = Config.sayi;
		System.out.println(sayi + "initializer a giriş yapıldı");
	}
	
	public void metod() {
		//sayi = 13;
		System.out.println("Metod çağrıldı");
	}
}