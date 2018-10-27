package org.ismek.oop.polymorphism;

public class Surucu {

	Long id;
	String adi;
	String soyadi;
	String tcKimlikNo;
	
	@Override
	public String toString() {
		return "(" + tcKimlikNo + ") " + adi + " " + soyadi;
	}
}