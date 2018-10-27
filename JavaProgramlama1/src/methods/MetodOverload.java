package methods;

public class MetodOverload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 8;
		int b = 9;
		int sonuc = toplamGetir(a, b);
		System.out.println(sonuc);
		
		int sonuc2 = toplamGetir(a, b, 6);
		System.out.println(sonuc2);
	}

	private static int toplamGetir(int a, int b) {
		int sonuc = a + b;
		return sonuc;
	}

	private static int toplamGetir(int a, int b, int c) {
		int sonuc = a + b + c;
		return sonuc;
	}
}
