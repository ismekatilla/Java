package thread;

import java.util.Scanner;

public class SonsuzDonguProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread threadSonsuzDongu = new Thread(new SonsuzDongu(), "SonsuzDongu");
		threadSonsuzDongu.setPriority(Thread.MIN_PRIORITY);
		
		Thread threadKullanici = new Thread(new KullaniciAdiRunnable(), "Kullanici");
		threadKullanici.setPriority(Thread.MAX_PRIORITY);
		
		threadSonsuzDongu.start();
		threadKullanici.start();
		
	}
}