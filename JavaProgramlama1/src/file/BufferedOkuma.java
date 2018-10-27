package file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedOkuma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("Z:\\JavaProgramlama\\java.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String satir = bufferedReader.readLine();
			while (satir != null) {
				System.out.println(satir);
				satir = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		}
		
		try (FileInputStream fileInputStream = new FileInputStream("Z:\\JavaProgramlama\\java.txt")) {
			Reader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String satir = bufferedReader.readLine();
			while (satir != null) {
				System.out.println(satir);
				satir = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		}
	}
}