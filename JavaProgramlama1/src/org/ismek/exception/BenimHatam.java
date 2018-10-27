package org.ismek.exception;

public class BenimHatam extends Exception {

	int hataKodu;
	String hataMesaji;
	
	public BenimHatam(int hataKodu, String hataMesaji) {
		this.hataKodu = hataKodu;
		this.hataMesaji = hataMesaji;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.format("Hata Kodu = %d\nHata Mesaji = %s\nTest = %s", hataKodu, hataMesaji, "SLŞDKŞALSKD");
		return str;
	}
}