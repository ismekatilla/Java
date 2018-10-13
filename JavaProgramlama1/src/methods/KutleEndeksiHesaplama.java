package methods;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class KutleEndeksiHesaplama {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float boy = 1.7f;
		float kilo = 90;
		float kutle = kutleEndeksiHesapla(kilo, boy);
		System.out.println(kutle);
		
		float boy2 = 1.8f;
		float kilo2 = 100;
		float kutle2 = kutleEndeksiHesapla(kilo2, boy2);
		System.out.println(kutle2);
		
		float boy3 = 1.5f;
		float kilo3 = 70;
		float kutle3 = kutleEndeksiHesapla(kilo3, boy3);
		System.out.println(kutle3);
	}
	
	static float kutleEndeksiHesapla(float kilo, float boy) {
		float endeks = kilo / (boy * boy) * 7;
		return endeks;
	}

}
