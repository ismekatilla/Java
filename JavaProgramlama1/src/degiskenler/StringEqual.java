package degiskenler;

public class StringEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String adi = "Ahmet";
		String adi2 = "Ahmet";
		System.out.println(adi == adi2);
		System.out.println(adi.equals(adi2));
		System.out.println(adi.hashCode());
		System.out.println(adi2.hashCode());
		System.out.println("------------------");
		adi2 = "TEST";
		System.out.println(adi == adi2);
		System.out.println(adi.equals(adi2));
		System.out.println(adi.hashCode());
		System.out.println(adi2.hashCode());
	}
}