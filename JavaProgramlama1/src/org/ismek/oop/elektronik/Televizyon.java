package org.ismek.oop.elektronik;

public final class Televizyon extends ElektronikEsya {

	boolean uyduAlicili;
	boolean threed;
	boolean smart;
	
	public void izle() {
		System.out.println("Televizyon İzlendi");
	}

	@Override
	public void fisiTak() {
		System.out.println("Televizyonun Fişi Takıldı");		
	}
}