package cases;

import java.util.Scanner;

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String gun = scanner.next();
		
		switch (gun) {
		case "PTS":
			System.out.println("PAZARTESÝ");
			break;
		case "SL":
			System.out.println("SALI");
			break;
		case "ÇRÞ":
			System.out.println("ÇARÞAMBA");
			break;
		case "PRÞ":
			System.out.println("PERÞEMBE");
			break;
		default:
			System.out.println("HAFTANIN BÝR GÜNÜ ÝÞTE");
			break;
		}
		
		if (gun.equals("PTS")) {
			System.out.println("PAZARTESÝ");
		} else if (gun.equals("SL")) {
			System.out.println("SALI");
		} else if (gun.equals("ÇRÞ")) {
			System.out.println("ÇARÞAMBA");
		} else if (gun.equals("PRÞ")) {
			System.out.println("PERÞEMBE");
		} else {
			System.out.println("HAFTANIN BÝR GÜNÜ ÝÞTE");
		}
	}

}
