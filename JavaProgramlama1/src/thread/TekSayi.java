package thread;

public class TekSayi implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 00; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}