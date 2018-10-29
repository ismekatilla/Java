package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap();
		hashmap.put("ABC", 4);
		hashmap.put("DEF", 1);
		hashmap.put("ERT", 2);
		hashmap.put("ASDD", 1);
		hashmap.put("IUEW", 3);
		System.out.println(hashmap.entrySet());
		System.out.println("\n----------\n");
		Iterator<Entry<String, Integer>> iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getValue());
		}
		System.out.println("\n----------\n");
		for (String key : hashmap.keySet()) {
			Integer value = hashmap.get(key);
			System.out.println(value);
		}
		
		System.out.println("\n----------\n");
		
		LinkedHashMap linkedHashMap = new LinkedHashMap();
		linkedHashMap.put(1, "ABC");
		linkedHashMap.put(2, "EDE");
		linkedHashMap.put(3, "ASD");
		Set entrySet = linkedHashMap.entrySet();
		System.out.println(entrySet);
		
		System.out.println("\n----------\n");
		
		TreeMap treemap = new TreeMap();
		treemap.put(2, "ABC");
		treemap.put(1, "DEF");
		treemap.put(0, "GGG");
		System.out.println(treemap.entrySet());
	}
}