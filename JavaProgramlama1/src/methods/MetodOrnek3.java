package methods;

public class MetodOrnek3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ikininKaresiniAl();
		verilenSayininKaresiniAl(3);
		int sonuc = sayininKaresiniAl(4);
		System.out.println(sonuc);
	}
	
	static void ikininKaresiniAl() {
		int iki = 2;
		int sonuc = iki * iki;
		System.out.println(sonuc);
	}
	
	static void verilenSayininKaresiniAl(int sayi) {
		int sonuc = sayi * sayi;
		System.out.println(sonuc);
	}
	
	static int sayininKaresiniAl(int sayi) {
		int sonuc = sayi * sayi;
		return sonuc;
	}
}
