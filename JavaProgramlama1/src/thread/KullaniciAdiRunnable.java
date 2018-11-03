package thread;

import java.util.Scanner;

public class KullaniciAdiRunnable implements Runnable {

	@Override
	public void run() {
		do {
			System.out.println("Kullanıcı Adı Giriniz.");
		} while (true);
	}
}
