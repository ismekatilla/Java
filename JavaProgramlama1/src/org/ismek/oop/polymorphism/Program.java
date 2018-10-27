package org.ismek.oop.polymorphism;

public class Program {

	public static void main(String[] args) {

		Tasit otobus = new Otobus();
		otobus.hareketEt();
		
		Tasit tren = new Tren();
		tren.hareketEt();
		
		HavaTasiti ucak = new Ucak();
		ucak.uc();
	}
}