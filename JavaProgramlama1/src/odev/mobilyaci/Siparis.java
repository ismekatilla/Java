package odev.mobilyaci;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Siparis implements Serializable {

	private String siparisKodu;
	private Musteri musteri;
	private Map<Mobilya, Integer> mobilyaMap = new HashMap<Mobilya, Integer>();

	public String getSiparisKodu() {
		return siparisKodu;
	}

	public void setSiparisKodu(String siparisKodu) {
		this.siparisKodu = siparisKodu;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public Map<Mobilya, Integer> getMobilyaMap() {
		return mobilyaMap;
	}
}