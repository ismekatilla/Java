package org.ismek.oop.elektronik;

public abstract class ElektronikEsya {
	
	double fiyat;
	Marka marka;
	int watt;
	byte garantiSuresi;
	
	public ElektronikEsya() {
		System.out.println("Elektronik Eşya Nesne Oluşturuldu.");
	}
	
	public abstract void fisiTak();
}