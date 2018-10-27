package org.ismek.oop.sekil;

public class Ucgen extends Sekil {

	byte yukseklik;
	byte tabanUzunluk;
	
	public int alan() {
		return (int) (yukseklik * tabanUzunluk / 2);
	}
}