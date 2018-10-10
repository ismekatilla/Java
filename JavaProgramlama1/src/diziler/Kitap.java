package diziler;

public class Kitap {

	String adi;
	int yil;
	
	static void kitapBilgileriniYazdir(Kitap kitap){
		System.out.println("-----------------------");
		System.out.println("Kitap adı =" + kitap.adi);
		System.out.println("Kitap Yılı = " + kitap.yil);
		System.out.println("-----------------------");
	}
}
