package file;

import java.io.Serializable;

public class Brans implements Serializable {

	String ad;
	byte kod;
	
	public Brans(String ad, byte kod) {
		this.ad = ad;
		this.kod = kod;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public byte getKod() {
		return kod;
	}

	public void setKod(byte kod) {
		this.kod = kod;
	}
}