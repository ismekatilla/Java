package cases;

import java.util.Scanner;

public class NotHesaplama {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Doğru Cevap Sayısı");
		int dogruCevapSayisi = scanner.nextInt();
		
		System.out.print("Yanlış Cevap Sayısı");
		int yanlisCevapSayisi = scanner.nextInt();
		
		dogruCevapSayisi = dogruCevapSayisi - (yanlisCevapSayisi / 4); 
		float dogruCevapPuani = dogruCevapSayisi * 5;
		System.out.println("Doğru Puanı = " + dogruCevapPuani);

		float yanlisCevapPuani = yanlisCevapSayisi * 0.25f;
		System.out.println("Yanlış Puanı = " + yanlisCevapPuani);
		
		float genelPuan = dogruCevapPuani - yanlisCevapPuani;
		System.out.println("Aldığınız Puan = " + genelPuan);
		if (genelPuan > 50) {
			System.out.println("GEÇTİ");
		} else {
			System.out.println("KALDI");
		}
	}

}