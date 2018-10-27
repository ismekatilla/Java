package org.ismek.oop.elektronik;

public class CamasirMakinesi extends BeyazEsya implements Workable{

	byte kilo;
	
	public void yika() {
		
	}

	@Override
	public void fisiTak() {
		System.out.println("Çamaşır Makinesi Fişi Takıldı");
	}

	@Override
	public void calistir() {
		System.out.println("Çamaşır Makinesi Çalıştı.");
	}
}