package org.ismek.oop.inheritance;

public abstract class Button {

	String caption;
	
	public Button(String caption) {
		this.caption = caption;
	}
	
	public abstract char getButtonSimge();
	
	public void ciz() {
		char buttonSimge = getButtonSimge();
		
		int length = caption.length();
		int uzunluk = length * 3;

		for (int i = 0; i < uzunluk; i++) {
			System.out.print(buttonSimge);
		}
		
		System.out.println();
		System.out.println(caption);
		
		for (int i = 0; i < uzunluk; i++) {
			System.out.print(buttonSimge);
		}
	}
}