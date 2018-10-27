package org.ismek.oop.sekil;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Kare kare = new Kare();
		kare.kenarUzunluk = 5;
		int alan = kare.alan();
		System.out.println(alan);
		
		CevresiHesaplanabilir kare2 = new Kare(Byte.parseByte("25"));
		int cevresiniHesapla = kare2.cevresiniHesapla();
		System.out.println(cevresiniHesapla);
	}
}