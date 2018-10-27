package methods;

public class MetodOrnek4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Abone abone = new Abone();
		abone.adSoyad = "ALİ VELİ";
		String mesaj = abone.suGetir(abone.adSoyad);
		System.out.println(mesaj);
		
		Abone abone2 = new Abone();
		abone2.adSoyad = "SEZEN MUŞLU";
		abone2.telefon = 4562345;
		String mesaj2 = abone2.suGetir(abone2.telefon, abone2.adSoyad);
		System.out.println(mesaj2);
		
	}

}
