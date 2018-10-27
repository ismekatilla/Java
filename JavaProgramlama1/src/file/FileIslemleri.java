package file;

import java.io.File;

public class FileIslemleri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("Z:\\");
		String[] dosyaAdiArray = file.list();
		for (String dosyaAdi : dosyaAdiArray) {
			System.out.println(dosyaAdi);
		}
		
		File[] listFiles = file.listFiles();
		for (File innerFile : listFiles) {
			
			String dosyaAdi = innerFile.getName();
			boolean directory = innerFile.isDirectory();
			if (directory) {
				System.out.println("\"" + dosyaAdi + "\" bir klasördür.");
			} else {
				System.out.println("\"" + dosyaAdi + "\" bir dosyadır.");
			}
		}
	}
}