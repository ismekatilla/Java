package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableProgram {

	public static void main(String args[]) {
		Personel personel = new Personel();
		personel.setAd("AHMET");
		personel.setMaas(3500);
		
		try (FileOutputStream fileOutputStream = new FileOutputStream("Z:\\JavaProgramlama\\personel.txt", false)) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(personel);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(FileInputStream fileInputStream = new FileInputStream("Z:\\JavaProgramlama\\personel.txt")) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Personel personel2 = (Personel) objectInputStream.readObject();
			System.out.println(personel2.getAd());
			System.out.println(personel2.getMaas());
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
