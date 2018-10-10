package diziler;

public class StaticHakkinda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int insanSayisi = Ogrenci.mevcut;
		System.out.println(insanSayisi);
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.adi = "ATİLLA";
		Ogrenci.mevcut++;
		System.out.println(Ogrenci.mevcut);
		
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.adi="EBRU";
		ogrenci2.mevcut++;
		
		System.out.println(ogrenci.mevcut);
	}
}