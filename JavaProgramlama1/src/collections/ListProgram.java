package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Vector;

public class ListProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Bayram");
		list.add(3);
		list.add(4);
		list.add(2, "EBRU");
		list.set(1, 8);
		list.add(2);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println("\n-------------\n");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("Bayram");
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(2, "EBRU");
		linkedList.set(1, 8);
		linkedList.add(2);
		linkedList.addFirst("ÖĞRENCi");
		linkedList.addLast(12312);
		for (Object object : linkedList) {
			System.out.println(object);
		}
		Object element = linkedList.element();
		System.out.println(element);
		
		Queue queue = new LinkedList();
		queue.add("ABC");
		queue.add("DEF");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		Object element2 = queue.element();
		System.out.println(element2);
	}

}
