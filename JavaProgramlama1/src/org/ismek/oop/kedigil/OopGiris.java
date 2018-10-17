package org.ismek.oop.kedigil;

public class OopGiris {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kopek kopek = new Kopek();
		kopek.boy = 2.1f;
		kopek.cinsiyet = "ERKEK";
		kopek.kilo = 300;
		kopek.hiz = 50;
		System.out.println(kopek.hiz);
		kopek.havla();
		kopek.besle();
		
		Kopek kopek2 = new Kopek(150, "DİŞİ", 225, 35);
		kopek2.havla();
		
		Kedi kedi = new Kedi();
		kedi.boy = 2.2f;
		kedi.cinsiyet = "DİŞİ";
		kedi.kilo = 150;
		kedi.hiz = 120;
		kedi.miyavla();
		kedi.besle();
	}

}
