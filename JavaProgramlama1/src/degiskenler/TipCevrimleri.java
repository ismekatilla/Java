package degiskenler;

public class TipCevrimleri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte tip1 = 125;
		
		int tip2 = 130;
		
		tip1 = (byte) tip2;
		
		System.out.println(tip1);
		
		float tip3 = (float) 130.2;
		
		float tip4 = 130.2f;
		
		tip2 = (int) tip4;
		System.out.println(tip2);
		
		
		String sayi = "345";
		byte byteAsStr = new Byte(sayi);
	}
}