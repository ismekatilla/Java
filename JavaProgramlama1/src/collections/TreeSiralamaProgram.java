package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSiralamaProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç sayı gireceksiniz");
		int girilecekSayi = scanner.nextInt();
		for (int i = 0; i < girilecekSayi; i++) {
			System.out.print("Sayı giriniz = ");
			int sayi = scanner.nextInt();
			treeset.add(sayi);
		}
		
		for (Object object : treeset) {
			System.out.println(object);
		}
	}

}
