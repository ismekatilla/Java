package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {

	static File file;
	static Scanner scanner;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		do {
			System.out.println("0. Çıkış");
			System.out.println("1. Dosya Oluştur");
			System.out.println("2. Sil");
			System.out.println("3. Uygulama Kapatıldıktan Sonra Sil");
			System.out.println("4. Dosya Bilgilerini Yazdır");
			System.out.println("5. Klasör Oluştur");
			System.out.println("İşlem seçiniz");
			
			int secim = scanner.nextInt();
			switch (secim) {
			case 0:
				System.exit(0);
				break;
			case 1:
				dosyaOlustur();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				dosyayiUygulamaKapatildiktanSonraSil(file);
				break;
			case 4:
				dosyaBilgileriniYazdir(file);
				break;
			case 5:
				klasorOlustur();
				break;
			default:
				break;
			}
			
			System.out.println("\n\n");
			
		} while (true);
	}

	private static void klasorOlustur() {
		String klasorAdi = scanner.next();
		String name = file.getName();
		String path = file.getPath();
		klasorAdi = path.replace(name, klasorAdi);
		file = new File(klasorAdi);
		file.mkdir();
	}
	
	private static void dosyaBilgileriniYazdir(File file) {

		String absolutePath = file.getAbsolutePath();
		System.out.println("AbsolutePath = " + absolutePath);
		
		String name = file.getName();
		System.out.println("Dosya Adı = " + name);
		
		String path = file.getPath();
		System.out.println("Path = " + path);
	}

	private static void dosyaSil() {
		
		if (file != null) {
			String path = file.getPath();
			System.out.println("Aktif dosya yolu = " + path);
			System.out.println("Bu dosyayı silmek için 1, yeni bir dosya seçmek için 2");
			int secim = scanner.nextInt();
			if (secim == 1) {
				file.delete();
			} else {
				System.out.println("Silinecek Dosya Yolu");
				String silinecekDosyaYolu = scanner.next();
				file = new File(silinecekDosyaYolu);
				file.delete();
			}
			System.out.println("Dosya silindi.");
		} else {
			System.out.println("Silinecek Dosya Yolu");
			String silinecekDosyaYolu = scanner.next();
			file = new File(silinecekDosyaYolu);
			file.delete();
		}
	}
	
	private static void dosyayiUygulamaKapatildiktanSonraSil(File file) {
		file.deleteOnExit();
		System.out.println("Dosya programdan çıkış yapıldıktan sonra silinecek.");
	}
	
	private static void dosyaOlustur() {
		try {
			System.out.println("Dosyanın tam yolunu giriniz.");
			String dosyaTamYolu = scanner.next();
			file = new File(dosyaTamYolu);
			file.createNewFile();
			System.out.println("Dosya oluşturuldu.");
		} catch (IOException e) {
			System.out.println("Dosya oluşturulamadı." + e.getMessage());
		}
	}
}