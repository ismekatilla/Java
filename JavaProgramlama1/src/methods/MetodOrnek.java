package methods;

public class MetodOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int sayi1 = 3;
		int sayi2 = 4;
		int sonuc = sayi1 * sayi2;
		System.out.println(sonuc);

		int sayi3 = 8;
		int sayi4 = 9;
		int sonuc2 = sayi3 * sayi4;
		System.out.println(sonuc2);
		
		carp(10, 3);
		carp(2, 1);
	}
	
	private static void carp(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		System.out.println(sonuc);
	}

}
