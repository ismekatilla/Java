package thread;

public class ThreadProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new TekSayi(), "TumSayi");
		Thread thread2 = new Thread(new CiftSayi(), "CiftSayi");

		thread.start();
		thread2.start();
	}
}