package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Maas maas = new Maas("TEKİR", 3250);
		try (FileOutputStream fileOutputStream = new FileOutputStream("Z:\\JavaProgramlama\\maas.txt", false)) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(maas);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileInputStream fileInputStream = new FileInputStream("Z:\\JavaProgramlama\\maas.txt")) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Maas maas2 = (Maas) objectInputStream.readObject();
			System.out.println(maas2.getPersonel());
			System.out.println(maas2.getMaas());
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
