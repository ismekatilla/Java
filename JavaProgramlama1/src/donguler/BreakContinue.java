package donguler;

public class BreakContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sayi = 10;
		for (int i = 0; i < sayi; i++) {
			if (i == 5) {
				continue;
				
			}
			
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
	}
}