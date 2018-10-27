package org.ismek.oop.polymorphism;

public abstract class Tasit {

	private double biletUcreti;
	private EnumYakitTuru yakitTuru;
	private Surucu surucu;
	
	public Tasit() {
		System.out.println("TAŞIT constructor çağrıldı.");
	}
	
	public void hareketEt(){
		System.out.println("Taşıt hareket ettirildi");
	}

	public double getBiletUcreti() {
		return biletUcreti;
	}

	public void setBiletUcreti(double biletUcreti) {
		this.biletUcreti = biletUcreti;
	}

	public EnumYakitTuru getYakitTuru() {
		return yakitTuru;
	}

	public void setYakitTuru(EnumYakitTuru yakitTuru) {
		this.yakitTuru = yakitTuru;
	}

	public Surucu getSurucu() {
		return surucu;
	}

	public void setSurucu(Surucu surucu) {
		this.surucu = surucu;
	}
}