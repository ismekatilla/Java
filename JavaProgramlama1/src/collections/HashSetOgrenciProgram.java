package collections;


import java.util.HashSet;

public class HashSetOgrenciProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci(3, "BAYRAM");
		Ogrenci ogrenci2 = new Ogrenci(2, "EBRU");
		Ogrenci ogrenci3 = new Ogrenci(3, "BAYRAM");
		Ogrenci ogrenci4 = new Ogrenci(3, "BATUHAN");
		
		HashSet<Ogrenci> hashSet = new HashSet();
		hashSet.add(ogrenci);
		hashSet.add(ogrenci2);
		hashSet.add(ogrenci3);
		hashSet.add(ogrenci4);
		
		for (Ogrenci ogrenci5 : hashSet) {
			String ad = ogrenci5.getAd();
			System.out.println(ad);
		}
	}

}
