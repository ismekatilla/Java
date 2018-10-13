package diziler;

public class ArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] hedefDizi = hedefDiziOlustur();
		hedefDiziYazdir(hedefDizi);
	}
	
	static int[] hedefDiziOlustur() {
		int[] hedefDizi = new int[4];
		
		int[] dizi = new int[4];
		dizi[0] = 1;
		dizi[1] = 2;
		dizi[2] = 5;
		dizi[3] = 10;
		
		int[] dizi2 = { 3, 8, 20};
		
		System.arraycopy(dizi, 0, hedefDizi, 0, 2);
		System.arraycopy(dizi2, 1, hedefDizi, 2, 2);
		return hedefDizi;
	}

	static void hedefDiziYazdir(int[] hedefDizi) {
		for (int i = 0; i < hedefDizi.length; i++) {
			System.out.println(hedefDizi[i]);
		}
	}
}
