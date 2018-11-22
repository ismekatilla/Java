package collections;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Integer> degisken = new HashSet<Integer>();
		degisken.add(1);
		degisken.add(2);
		degisken.add(3);
		degisken.add(2);
		System.out.println(degisken.size());
	}
}