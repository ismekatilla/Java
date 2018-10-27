package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilestirmeProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Kedi kedi = new Kedi("TEKİR", "VAN", (byte) 3);
		try (FileOutputStream fileOutputStream = new FileOutputStream("Z:\\JavaProgramlama\\kedi.txt", false)) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(kedi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fileInputStream = new FileInputStream("Z:\\JavaProgramlama\\kedi.txt")) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Kedi kedi2 = (Kedi) objectInputStream.readObject();
			System.out.println(kedi2.getTur());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 