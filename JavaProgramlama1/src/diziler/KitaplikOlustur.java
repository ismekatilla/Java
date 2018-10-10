package diziler;

public class KitaplikOlustur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kitap kitap = new Kitap();
		kitap.adi = "HAYIRLAMIYORUM";
		kitap.yil = 2018;
		
		Kitap kitap2 = new Kitap();
		kitap2.adi = "KİTAP2";
		kitap2.yil = 2000;
		
		Kitap kitap3 = new Kitap();
		kitap3.adi = "KİTAP3";
		kitap3.yil = 2013;
		
		Kitap[] kitaplik = new Kitap[2];
		kitaplik[0] = kitap2;
		kitaplik[1] = kitap;
		
		for (int i = 0; i < kitaplik.length; i++) {
			Kitap ornek = kitaplik[i];
			Kitap.kitapBilgileriniYazdir(ornek);
		}

	}

}

/*
	Kitap Adı = ....
	Kitap Yılı = ....

*/