package file;

import java.io.Serializable;

public class Kedi {

	private String ad;
	private String tur;
	private byte yas;

	public Kedi(String adi, String turu, byte yasi) {
		ad = adi;
		tur = turu;
		yas = yasi;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public byte getYas() {
		return yas;
	}

	public void setYas(byte yas) {
		this.yas = yas;
	}
}