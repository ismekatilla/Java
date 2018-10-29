package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class OgrenciKayitProgrami {

	public static void main(String[] args) {
		Ogretmen ogretmen = new Ogretmen(3, "Öğretmen1");
		Ogretmen ogretmen2 = new Ogretmen(2, "Öğretmen2");
		
		Ogrenci ogrenci = new Ogrenci(1, "BAYRAM");
		Ogrenci ogrenci2 = new Ogrenci(2, "EBRU");
		ArrayList ogrenciList = new ArrayList();
		ogrenciList.add(ogrenci);
		ogrenciList.add(ogrenci2);
		
		Ogrenci ogrenci3 = new Ogrenci(5, "ABC");
		Ogrenci ogrenci4 = new Ogrenci(6, "DEF");
		ArrayList ogrenciList2 = new ArrayList();
		ogrenciList2.add(ogrenci3);
		ogrenciList2.add(ogrenci4);
		
		//HashMap ogretmenOgrenciMap = new HashMap<Ogretmen, ArrayList<Ogrenci>>();
		HashMap ogretmenOgrenciMap = new HashMap();
		ogretmenOgrenciMap.put(ogretmen, ogrenciList);
		System.out.println(ogretmenOgrenciMap.entrySet());
		
		
		Ogretmen ogretmen3 = new Ogretmen(3, "");
		Object arananOgretmen = ogretmenOgrenciMap.get(ogretmen3);
		System.out.println(arananOgretmen);
		
		TreeMap map = new TreeMap();
		map.put(ogretmen, ogrenciList);
		map.put(ogretmen2, ogrenciList2);
		System.out.println(map.entrySet());
	}
}