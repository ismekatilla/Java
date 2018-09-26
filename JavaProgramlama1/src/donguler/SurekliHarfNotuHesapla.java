package donguler;

import java.util.Scanner;

public class SurekliHarfNotuHesapla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Aldığınız not = ");
			byte not = scanner.nextByte();
			
			if (not > 0 && not <21) {
				System.out.println("Aldığınız harf notu = FF");
				break;
			} else if (not >= 20 && not <41) {
				System.out.println("Aldığınız harf notu = DC");
			} else if (not > 40 && not <61) {
				System.out.println("Aldığınız harf notu = CC");
			}  else if (not > 60 && not <81) {
				System.out.println("Aldığınız harf notu = BB");
			} else {
				System.out.println("Aldığınız harf notu = AA");
			}
		} while (true);
	}

}
