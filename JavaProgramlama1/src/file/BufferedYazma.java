package file;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedYazma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String yazi = "Test yazısı";
		try (FileWriter fileWriter = new FileWriter("Z:\\JavaProgramlama\\java.txt")) {
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(yazi);
			bufferedWriter.flush();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		}
		System.out.println("ilk kez yazdık");
		
		try (FileOutputStream fileOutputStream = new FileOutputStream("Z:\\JavaProgramlama\\java.txt", true)) {
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			bufferedOutputStream.write(yazi.getBytes());
			bufferedOutputStream.flush();
		} catch (IOException e) {
			System.out.println("Genel yazma hatası");
		}
		System.out.println("ikinci kez yazdık");
	}
}