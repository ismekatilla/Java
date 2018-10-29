package collections;

import java.util.TreeSet;

public class OgrenciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ogrenci ogrenci = new Ogrenci(3, "BAYRAM");
		Ogrenci ogrenci2 = new Ogrenci(2, "EBRU");
		TreeSet<Ogrenci> treeset = new TreeSet();
		treeset.add(ogrenci);
		treeset.add(ogrenci2);
		for (Ogrenci ogrenci3 : treeset) {
			System.out.println(ogrenci3.getAd());
		}
	}
}