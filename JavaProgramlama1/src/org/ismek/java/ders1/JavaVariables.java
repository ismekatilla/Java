package org.ismek.java.ders1;

public class JavaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "STR1";
		String s2 = "STR2";
		String s3 = "STR1";
		String s4 = s1;
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		s4 = "STR4";
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		// http://www.javadunyasi.com/string-nesnesi-uretme-ve-string-pool/
		// http://www.ysfcyln.com/yazilim/java/equals-ve-esittir-karsilastirma-operatorleri-arasindaki-fark
	}
}