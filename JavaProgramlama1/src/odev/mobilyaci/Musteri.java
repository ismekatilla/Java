package odev.mobilyaci;

import java.io.Serializable;

public class Musteri implements Serializable {

	private String adiSoyadi;
	private String tcKimlikNo;
	private String telefon;

	public Musteri(String adiSoyadi, String tcKimlikNo, String telefon) {
		super();
		this.adiSoyadi = adiSoyadi;
		this.tcKimlikNo = tcKimlikNo;
		this.telefon = telefon;
	}
	
	public String getAdiSoyadi() {
		return adiSoyadi;
	}

	public void setAdiSoyadi(String adiSoyadi) {
		this.adiSoyadi = adiSoyadi;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + tcKimlikNo + ") " + adiSoyadi;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(tcKimlikNo);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Musteri musteri = (Musteri) obj;
		return musteri.tcKimlikNo.equals(tcKimlikNo);
	}
}