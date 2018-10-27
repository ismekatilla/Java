package org.ismek.oop.inheritance;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button btn = new KaydetButton("ATİLLA");
		btn.ciz();
		
		System.out.println();
		
		Button btn2 = new SilButton("FATİH BİLİŞİM OKULU");
		btn2.ciz();
		
		System.out.println();

		Button btn3 = new YeniButton("YENİ BUTONU");
		btn3.ciz();
	}

}
