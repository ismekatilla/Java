package degiskenler;

public class BoxingUnboxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Boxing
		Integer degisken = new Integer(8);
		System.out.println(degisken);
		
		
		// Unboxing
		int Degisken = degisken.intValue();
		System.out.println(Degisken);
	}

}
