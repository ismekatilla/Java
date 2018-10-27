package org.ismek.exception;

public class ClassCastExceptionProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brans brans = new Brans();
		brans.bransAdi = "BRANŞ";
		
		Marka marka = new Marka();
		marka.markaAdi = "MARKA";
		
		try{
			Object object = brans;
			Marka marka2 = (Marka) object;
			System.out.println(marka2);
		} catch (ClassCastException exception) {
			System.out.println("Class çevrimlerini yanlış yaptınız.");
		}
	}

	static class Brans {
		String bransAdi;
	}
	
	static class Marka {
		String markaAdi;
	}
}