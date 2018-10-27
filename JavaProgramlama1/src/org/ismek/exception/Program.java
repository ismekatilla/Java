package org.ismek.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.ismek.exception.ClassCastExceptionProgram.Brans;
import org.ismek.oop.polymorphism.FrenYapabilir;

public class Program {

	public static void main(String args[]) {
		
		int[] dizi = { 3, 4, 5};
		int deger1 = 5;
		int deger2 = 3;
		
		try {
			int sonuc = deger1 / deger2;
			System.out.println(sonuc);
			
			int sayi = dizi[deger1];
			System.out.println(sayi);
		} catch(ArithmeticException e) {
			System.out.println(deger1 + " sayısı " + deger2 + " sayısına bölünemez");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(deger1 + " index li dizi kaydı yoktur.");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yazdırmak istediğiniz sayıyı giriniz");
		int girilenSayi = 0;
		try {
			girilenSayi = scanner.nextInt();
		} catch(Exception ex) {
			System.out.println("Lütfen gireceğiniz değer sayi olsun");
			scanner.nextLine();
		}
		girilenSayi = scanner.nextInt();
		System.out.println(girilenSayi);
		
		try {
			System.out.println(dizi[2]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Dizi sınırları dışındaki bir değeri yazdırmak istediniz.");
		}
		
		
		try {
			System.out.println(dizi[5]);
		} catch (Exception ex) {
			System.out.println("Beklenmeyen bir hata oluştu." + ex);
		}
	}
}
