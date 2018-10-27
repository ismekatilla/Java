package org.ismek.oop.elektronik;

public abstract class BeyazEsya extends ElektronikEsya {

	EnumEnerjiSinifi enerjiSinifi;
	
	public BeyazEsya() {
		System.out.println("Beyaz Eşya Nesnesi Oluşturuldu.");
	}
	
	public void dereceAyarla(int derece) {
		System.out.println("BeyazEsya Derecesi " + derece + " olarak ayarlandı.");
	}
	
	public final void overrideEdilemezMetod() {
		System.out.println("Bu metod override edilemez.");
	}
}