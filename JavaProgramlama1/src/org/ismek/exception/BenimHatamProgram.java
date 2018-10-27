package org.ismek.exception;

public class BenimHatamProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 3;
		int sayi2 = 0;
		try {
			girilenSayilariKontrolEt(sayi1, sayi2);
			int sonuc = sayi1 * sayi2;
			System.out.println(sonuc);
		} catch(BenimHatam e) {
			System.out.println(e);
		} catch(Exception e){
			System.out.println("Tanımlanamayan Hata");
		}
	}

	private static void girilenSayilariKontrolEt(int sayi, int sayi2) throws BenimHatam {
		if (sayi == 3) {
			throw new BenimHatam(1, "3 DEĞERİ GİRİLEMEZ");
		} else if (sayi == 0) {
			throw new BenimHatam(2, "0 DEĞERİ GİRİLEMEZ");
		} 
	}
}
