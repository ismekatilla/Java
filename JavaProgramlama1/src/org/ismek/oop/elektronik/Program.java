package org.ismek.oop.elektronik;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Buzdolabi buzdolabi = new Buzdolabi();
		buzdolabi.fiyat = 100d;
		buzdolabi.garantiSuresi = 3;
		buzdolabi.watt = 1000;
		buzdolabi.enerjiSinifi = EnumEnerjiSinifi.A_PLUS_PLUS;
		buzdolabi.fisiTak();
		
		Televizyon televizyon = new Televizyon();
		televizyon.fiyat = 123123d;
		televizyon.izle();
		
		Marka marka = new Marka();
		marka.id = 3l;
		marka.adi = "VESTEL";
		String markaString = marka.toString();
		System.out.println(markaString);
		
		Integer sayi = 10;
		sayiyiDegistir(sayi);
	}

	private static Integer sayiyiDegistir(final Integer sayi) {
		// final olarak verilen parametre değiştirilemez.
		//sayi++;
		return sayi;
	}

}
