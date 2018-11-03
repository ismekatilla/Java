package odev.mobilyaci;

import java.io.Serializable;

public class Mobilya implements Serializable {

	private String kod;
	private String adi;
	private double fiyat;

	public Mobilya(String kod, String adi, double fiyat) {
		super();
		this.kod = kod;
		this.adi = adi;
		this.fiyat = fiyat;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + kod + ") " + adi;
	}
}