package diziler;

public class Abone {

	double x;
	double y;
	int alanKodu;
	double telefon;
	String adSoyad;
	int aboneNo;
	
	public static String suGetir(String ad){
		return "Ben " + ad + ". Su getirir misiniz?";
	}
	
	public static String suGetir(double telefon, String ad){
		return "Ben " + telefon + " numaralı hat sahibi " + ad + ". Su getirir misiniz?";
	}
}