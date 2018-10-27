package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class OgretmenKayitProgrami {

	static Ogretmen[] ogretmenler;
	static File file = new File("Z:\\JavaProgramlama\\ogretmenler.txt");
	
	public static void main(String[] args) {
		
		try(FileInputStream fileInputStream = new FileInputStream(file)) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			ogretmenler = (Ogretmen[]) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı");
		} catch (IOException e) {
			System.out.println("Genel Dosya Hatası");
		} catch (ClassNotFoundException e) {
			System.out.println("Öğretmen class ı bulunamadı");
		}
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1. EKLEME");
			System.out.println("2. LİSTELEME");
			System.out.println("3. ÇIKIŞ");
			
			int secim = scanner.nextInt();
			if (secim == 1) {
				System.out.println("Öğretmen Adı =\t");
				String ogretmenAdi = scanner.nextLine();
				
				System.out.println("Öğretmen Soyadı =\t");
				String ogretmenSoyadi = scanner.nextLine();
				
				System.out.println("Branş Adı");
				String bransAdi = scanner.nextLine();
				
				System.out.println("Branş Kodu");
				byte bransKodu = scanner.nextByte();
				
				Brans brans = new Brans(bransAdi, bransKodu);
				Ogretmen ogretmen = new Ogretmen(ogretmenAdi, ogretmenSoyadi, brans);
				
				if (ogretmenler == null) {
					ogretmenler = new Ogretmen[1];
				} else {
					ogretmenler = Arrays.copyOf(ogretmenler, ogretmenler.length + 1);
				}
				ogretmenler[ogretmenler.length - 1] = ogretmen;
				
				try (FileOutputStream fileOutputStream = new FileOutputStream(file, false)) {
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
					objectOutputStream.writeObject(ogretmenler);
				} catch (FileNotFoundException e) {
					System.out.println("Dosya Bulunamadı");
				} catch (IOException e) {
					System.out.println("Genel bir dosya hatası");
				}
			} else if (secim == 2){
				for (Ogretmen ogretici : ogretmenler) {
					System.out.println(ogretici);
				}
			} else {
				System.exit(0);
			}
			
		} while (true);
	}
}
