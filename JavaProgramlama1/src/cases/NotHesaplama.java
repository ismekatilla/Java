package cases;

import java.util.Scanner;

public class NotHesaplama {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Doðru Cevap Sayýsý");
		int dogruCevapSayisi = scanner.nextInt();
		
		System.out.print("Yanlýþ Cevap Sayýsý");
		int yanlisCevapSayisi = scanner.nextInt();
		
		dogruCevapSayisi = dogruCevapSayisi - (yanlisCevapSayisi / 4); 
		float dogruCevapPuani = dogruCevapSayisi * 5;
		System.out.println("Doðru Puaný = " + dogruCevapPuani);

		float yanlisCevapPuani = yanlisCevapSayisi * 0.25f;
		System.out.println("Yanlýþ Puaný = " + yanlisCevapPuani);
		
		float genelPuan = dogruCevapPuani - yanlisCevapPuani;
		System.out.println("Aldýðý Puan = " + genelPuan);
		if (genelPuan > 50) {
			System.out.println("GEÇTÝ");
		} else {
			System.out.println("KALDI");
		}
	}

}