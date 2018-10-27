package file;

import java.io.Serializable;

public class Ogretmen implements Serializable {

	String ad;
	String soyad;
	Brans brans;

	public Ogretmen(String ad, String soyad, Brans brans) {
		this.ad = ad;
		this.soyad = soyad;
		this.brans = brans;
	}
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Brans getBrans() {
		return brans;
	}

	public void setBrans(Brans brans) {
		this.brans = brans;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ad + " " + soyad + " " + brans.ad;
	}
}