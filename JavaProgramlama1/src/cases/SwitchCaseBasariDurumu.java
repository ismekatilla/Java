package cases;

import java.util.Scanner;

public class SwitchCaseBasariDurumu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Aldığınız harf notu\t:\t");
		String notDurumu = scanner.next();
		
		switch (notDurumu) {
		case "A":
			System.out.println("MÜKEMMEL");
			break;
		case "B":
		case "C":
			System.out.println("İYİ");
			break;
		case "D":
			System.out.println("FENA DEĞİL");
			break;
		case "E":
			System.out.println("KÖTÜ");
			break;
		case "F":
			System.out.println("ÇOK KÖTÜ");
			break;
		default:
			break;
		}
	}
}
