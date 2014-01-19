package chapter6_prototype;

import chapter6_prototype.framework.Product;

public class Underline extends Product {
	private char ulchar;
	public Underline(char ulchar) {
		this.ulchar = ulchar;
	}
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

}
