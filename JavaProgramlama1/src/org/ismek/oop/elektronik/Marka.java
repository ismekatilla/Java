package org.ismek.oop.elektronik;

public class Marka {
	long id;
	String adi;
	byte[] logo;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + adi;
	}
}