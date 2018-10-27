package org.ismek.oop.elektronik;

public class CepTelefonu extends ElektronikEsya implements Startable, Closeable{

	public void kullan() {
		System.out.println("Telefon kullanıldı");
	}

	@Override
	public void fisiTak() {
		System.out.println("Cep Telefonu Fişi Takıldı");
	}

	@Override
	public void ac() {
		System.out.println("Televizyon açıldı");
		
	}

	@Override
	public void kapa() {
		System.out.println("Televizyon kapandı");
		
	}
}