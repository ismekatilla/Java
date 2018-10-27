package org.ismek.oop.inheritance;

public class SilButton extends Button {

	public SilButton(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getButtonSimge() {
		// TODO Auto-generated method stub
		return "-".charAt(0);
	}

}
