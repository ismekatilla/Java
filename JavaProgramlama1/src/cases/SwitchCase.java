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
			System.out.println("PAZARTESİ");
			break;
		case "SL":
			System.out.println("SALI");
			break;
		case "ÇRŞ":
			System.out.println("ÇARŞAMBA");
			break;
		case "PRŞ":
			System.out.println("PERŞEMBE");
			break;
		default:
			System.out.println("HAFTANIN BİR GÜNÜ DEĞİL");
			break;
		}
		
		if (gun.equals("PTS")) {
			System.out.println("PAZARTESİ");
		} else if (gun.equals("SL")) {
			System.out.println("SALI");
		} else if (gun.equals("ÇRŞ")) {
			System.out.println("ÇARŞAMBA");
		} else if (gun.equals("PRŞ")) {
			System.out.println("PERŞEMBE");
		} else {
			System.out.println("HAFTANIN BİR GÜNÜ DEĞİL");
		}
	}

}
