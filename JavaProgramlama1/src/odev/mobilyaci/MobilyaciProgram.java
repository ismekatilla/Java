package odev.mobilyaci;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MobilyaciProgram {

	static Scanner scanner = new Scanner(System.in);
	static List<Mobilya> mobilyaList = new ArrayList<Mobilya>();
	static Set<Musteri> musteriSet = new HashSet<Musteri>();
	static List<Siparis> siparisList = new ArrayList<Siparis>();
	
	public static void main(String[] args) {

		System.out.println("--- FATİH BİLİŞİM OKULU MOBİLYACI UYGULAMASI ---");
		musterileriDosyadanOku();
		mobilyalariDosyadanOku();
		siparisleriDosyadanOku();
		do {
			System.out.println("1. Müşteri Ekle");
			System.out.println("2. Müşteri Listele");
			System.out.println("3. Mobilya Ekle");
			System.out.println("4. Mobilya Listele");
			System.out.println("5. Sipariş Kaydı Oluştur");
			System.out.println("6. Sipariş Listele");
			System.out.println("0. Çıkış");
			System.out.print("Yapmak istediğiniz işlemi seçiniz =\t");
			byte secim = scanner.nextByte();
			scanner.nextLine();
			switch (secim) {
			case 0:
				musterileriDosyayaYaz();
				mobilyalariDosyayaYaz();
				siparisleriDosyayaYaz();
				System.exit(0);
				break;
			case 1:
				musteriEkle();
				break;
			case 2:
				musteriListele();
				break;
			case 3:
				mobilyaEkle();
				break;
			case 4:
				mobilyaListele();
				break;
			case 5:
				siparisKaydiOlustur();
				break;
			case 6:
				siparisleriYazdir();
				break;
			default:
				break;
			}
			
		} while (true);
	}

	private static void siparisleriYazdir() {
		for (Siparis siparis : siparisList) {
			System.out.println(" --- " + siparis.getSiparisKodu() + " --- ");
			Musteri musteri = siparis.getMusteri();
			System.out.println(musteri);
			
			Map<Mobilya, Integer> mobilyaMap = siparis.getMobilyaMap();
			for (Mobilya mobilya : mobilyaMap.keySet()) {
				Integer adet = mobilyaMap.get(mobilya);
				System.out.println(mobilya + " Adet = " + adet);
			}
		}
	}

	private static void siparisKaydiOlustur() {
		System.out.println("Müşteri T.C. Kimlik No =\t");
		String tcKimlikNo = scanner.nextLine();
		
		Musteri kayitliMusteri = null;
		for (Musteri musteri : musteriSet) {
			if (musteri.getTcKimlikNo().equals(tcKimlikNo)) {
				kayitliMusteri = musteri;
				break;
			}
		}
		
		if (kayitliMusteri == null) {
			System.out.println("Yeni Müşteri Kaydı Oluşturmalısınız");
			return;
		}

		Siparis siparis = new Siparis();
		siparis.setMusteri(kayitliMusteri);
		siparis.setSiparisKodu("A123");
		Map<Mobilya, Integer> mobilyaMap = siparis.getMobilyaMap();
		do {
			System.out.print("Mobilya Kodu =\t");
			String mobilyaKodu = scanner.nextLine();
			
			Mobilya kayitliMobilya = null;
			for (Mobilya mobilya : mobilyaList) {
				if (mobilya.getKod().equals(mobilyaKodu)) {
					kayitliMobilya = mobilya;
					break;
				}
			}
			
			if (kayitliMobilya != null) {
				System.out.print("Kaç adet =\t");
				int adet = scanner.nextInt();
				scanner.nextLine();
				mobilyaMap.put(kayitliMobilya, adet);
			}
			System.out.println("Sipariş Tamamsa 0 a basın.");
			byte secim = scanner.nextByte();
			if (secim == 0) {
				break;
			} else continue;
		} while (true);
		siparisList.add(siparis);
	}

	private static void musterileriDosyayaYaz() {
		try (FileOutputStream fileOutputStream = new FileOutputStream("Z:\\Mobilyaci\\musteri.txt")) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(musteriSet);
			objectOutputStream.flush();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı. " + e.getMessage());
		} catch (IOException e1) {
			System.out.println("Genel yazma hatası."  + e1.getMessage());
		}
	}
	
	private static void musterileriDosyadanOku() {
		try (FileInputStream fileInputStream = new FileInputStream("Z:\\Mobilyaci\\musteri.txt")) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			musteriSet = (Set<Musteri>) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı. " + e.getMessage());
		} catch (IOException e1) {
			System.out.println("Genel yazma hatası."  + e1.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Musteri Sınıfı bulunamadı. " + e.getMessage());
		}
	}
	
	private static void mobilyalariDosyayaYaz() {
		try (FileOutputStream fileOutputStream = new FileOutputStream("Z:\\Mobilyaci\\mobilya.txt")) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(mobilyaList);
			objectOutputStream.flush();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı. " + e.getMessage());
		} catch (IOException e1) {
			System.out.println("Genel yazma hatası."  + e1.getMessage());
		}
	}
	
	private static void mobilyalariDosyadanOku() {
		try (FileInputStream fileInputStream = new FileInputStream("Z:\\Mobilyaci\\mobilya.txt")) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			mobilyaList = (List<Mobilya>) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı. " + e.getMessage());
		} catch (IOException e1) {
			System.out.println("Genel yazma hatası."  + e1.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Mobilya Sınıfı bulunamadı. " + e.getMessage());
		}
	}

	private static void mobilyaListele() {
		System.out.println();
		System.out.println("--- Mobilya Listesi ---");
		for (Mobilya mobilya : mobilyaList) {
			System.out.println(mobilya);
		}
		System.out.println();
	}

	private static void musteriListele() {
		System.out.println();
		System.out.println("--- Müşteri Listesi ---");
		for (Musteri musteri : musteriSet) {
			System.out.println(musteri);
		}
		System.out.println();
	}

	private static void mobilyaEkle() {
		System.out.print("Mobilya Kodu =\t");
		String kod = scanner.nextLine();
		
		System.out.print("Mobilya Adı =\t");
		String ad = scanner.nextLine();
		
		System.out.print("Mobilya Fiyatı =\t");
		double fiyat = scanner.nextDouble();
		scanner.nextLine();
		
		Mobilya mobilya = new Mobilya(kod, ad, fiyat); 
		mobilyaList.add(mobilya);
	}

	private static void musteriEkle() {
		
		System.out.print("Müşteri Ad - Soyad =\t");
		String adSoyad = scanner.nextLine();
		
		System.out.print("Müşteri T.C. Kimlik No =\t");
		String tcKimlikNo = scanner.nextLine();

		System.out.print("Müşteri Telefon =\t");
		String telefon = scanner.nextLine();
		
		Musteri musteri = new Musteri(adSoyad, tcKimlikNo, telefon);
		musteriSet.add(musteri);
		System.out.println("Müşteri eklendi.");
	}
	
	private static void siparisleriDosyayaYaz() {
		try (FileOutputStream fileOutputStream = new FileOutputStream("Z:\\Mobilyaci\\siparis.txt")) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(siparisList);
			objectOutputStream.flush();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı. " + e.getMessage());
		} catch (IOException e1) {
			System.out.println("Genel yazma hatası."  + e1.getMessage());
		}
	}
	
	private static void siparisleriDosyadanOku() {
		try (FileInputStream fileInputStream = new FileInputStream("Z:\\Mobilyaci\\siparis.txt")) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			siparisList = (List<Siparis>) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı. " + e.getMessage());
		} catch (IOException e1) {
			System.out.println("Genel yazma hatası."  + e1.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Siparis Sınıfı bulunamadı. " + e.getMessage());
		}
	}
}