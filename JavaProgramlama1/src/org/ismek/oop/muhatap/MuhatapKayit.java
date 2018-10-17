package org.ismek.oop.muhatap;

public class MuhatapKayit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Muhatap[] muhatapDizi = getMuhatapArray();
		
		for (int i = 0; i < muhatapDizi.length; i++) {
			Muhatap muhatap = muhatapDizi[i];
			if (muhatap instanceof Vatandas) {
				Vatandas vatandas = (Vatandas) muhatap;
				vatandas.vatandasYazdir();
			} else {
				Kurum kurum = (Kurum) muhatap;
				kurum.kurumYazdir();
			}
		}
	}
	
	private static Muhatap[] getMuhatapArray() {
		Muhatap[] muhatapDizi = new Muhatap[2];
		
		Vatandas vatandas = new Vatandas("AHMET", "123123123");
		muhatapDizi[0] = vatandas;
		
		Kurum kurum = new Kurum("ALİ VELİ LTD. ŞTİ.", "2342312312");
		muhatapDizi[1] = kurum;
		return muhatapDizi;
	}

}