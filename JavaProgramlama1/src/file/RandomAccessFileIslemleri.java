package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileIslemleri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("Z:\\JavaProgramlama\\java.txt");
		try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")){
			long dosyaUzunluk = randomAccessFile.length();
			System.out.println(dosyaUzunluk);
			randomAccessFile.seek(dosyaUzunluk);
			
			randomAccessFile.writeInt(3333);
			dosyaUzunluk = randomAccessFile.length();
			System.out.println(dosyaUzunluk);
			
			randomAccessFile.writeDouble(123.4f);
			dosyaUzunluk = randomAccessFile.length();
			System.out.println(dosyaUzunluk);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
