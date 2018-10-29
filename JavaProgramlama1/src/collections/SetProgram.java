package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet hashset = new HashSet<>();
		hashset.add(3);
		hashset.add("TEST");
		hashset.add(4);
		hashset.add(5);
		hashset.add("TEST BATUHAN");
		
		Iterator iterator = hashset.iterator();
		while (iterator.hasNext()) {
			Object sonrakiDeger = iterator.next();
			System.out.println(sonrakiDeger);
		}
		
		for (Object object : hashset) {
			System.out.println(object);
		}
		
		System.out.println("\n\n");
		
		LinkedHashSet linkedhashset = new LinkedHashSet();
		linkedhashset.add(3);
		linkedhashset.add("TEST");
		linkedhashset.add(4);
		linkedhashset.add(5);
		linkedhashset.add("TEST BATUHAN");
		Iterator iteratorLinkedHashSet = linkedhashset.iterator();
		while (iteratorLinkedHashSet.hasNext()) {
			iteratorLinkedHashSet.next();
			iteratorLinkedHashSet.remove();
		}
		
		TreeSet treeset = new TreeSet();
		treeset.add(5);
		treeset.add(3);
		treeset.add(1);
		treeset.add(6);
		treeset.add(4);
		treeset.add(9);
		treeset.add(7);
		
		for (Object object : treeset) {
			System.out.println(object);
		}
		
		TreeSet treesetString = new TreeSet();
		treesetString.add("ABC");
		treesetString.add("DEF");
		treesetString.add("RTY");
		treesetString.add("H");
		treesetString.add("İ");
		treesetString.add("Ç");
		treesetString.add("G");
		
		for (Object object : treesetString) {
			System.out.println(object);
		}
		
		Object ceiling = treesetString.ceiling("P");
		System.out.println(ceiling);

		System.out.println("------------");
		SortedSet headSet = treesetString.headSet("R");
		for (Object object : headSet) {
			System.out.println(object);
		}		
	}
}