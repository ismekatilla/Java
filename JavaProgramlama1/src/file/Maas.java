package file;

import java.io.Serializable;

public class Maas implements Serializable {

	private String personel;
	private transient int maas;

	public Maas(String personelAdi, int maas) {
		personel = personelAdi;
		this.maas = maas;
	}

	public String getPersonel() {
		return personel;
	}

	public void setPersonel(String personel) {
		this.personel = personel;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}
}