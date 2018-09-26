package donguler;

import java.util.Scanner;

public class SayiBulmaOyunu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte hak = 0;
		boolean hakkiVar = true;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Lütfen 0 - 10 aralığında bir sayı tahmin ediniz.");
			byte kullanicininGirdigiDeger = scanner.nextByte();
			if (kullanicininGirdigiDeger == 3) {
				System.out.println("Tebrikler sayıyı buldunuz.");
				break;
			}
			hak++;
			if (hak == 3) {
				hakkiVar = false;
				System.out.println("3 Hakkınızı da kullandınız. Maalesef başarısız oldunuz");
			}
		} while (hakkiVar);
	}

}
//Runtime.getRuntime().exec("cls");