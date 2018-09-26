package cases;


import java.util.Scanner;

public class GunBulma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Gün Giriniz\t:\t");
		int gun = scanner.nextInt();
		int kalanGun = gun % 7;
		switch (kalanGun) {
		case 0:
			System.out.println("PAZAR");
			break;
		case 1:
			System.out.println("PAZARTESÝ");
			break;
		case 2:
			System.out.println("SALI");
			break;
		case 3:
			System.out.println("ÇARÞAMBA");
			break;
		case 4:
			System.out.println("PERÞEMBE");
			break;
		case 5:
			System.out.println("CUMA");
			break;
		case 6:
			System.out.println("CUMARTESÝ");
			break;
		default:
			System.out.println("GÜN BULUNAMADI");
			break;
		}
	}

}
