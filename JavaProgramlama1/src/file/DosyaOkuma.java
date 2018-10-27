package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("Z:\\JavaProgramlama\\java.txt");
		try {
			char[] okunacak = new char[(int) file.length()];
			FileReader fileReader = new FileReader(file);
			fileReader.read(okunacak);
			System.out.println(okunacak);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file2 = new File("Z:\\JavaProgramlama\\java.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file2);
			byte[] buffer = new byte[(int) file2.length()];
			fileInputStream.read(buffer);
			String okunanYazi = new String(buffer);
			System.out.println(okunanYazi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
