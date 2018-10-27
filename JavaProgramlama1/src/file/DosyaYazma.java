package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaYazma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String yazi = "Bu bir test yazısıdır";
		
		File file = new File("Z:\\JavaProgramlama\\java.txt");
		FileWriter fileWriter = null;
		try {
			// append true ise dosya içeriğini silmeden üstüne yazar.
			// append false ise dosya içeriğini tamamen ezer.
			fileWriter = new FileWriter(file, false);
			fileWriter.write(yazi);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Dosyaya yazma başarısız.");
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Dosya kapatılamadı.");
			}
		}
		System.out.println("ilk sefer yazıldı");
		
		File file2 = new File("Z:\\JavaProgramlama\\java.txt");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
			fileOutputStream.write(yazi.getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ikinci sefer yazıldı");
	}

}
