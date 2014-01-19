package chapter3_templateMethod;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world");
		AbstractDisplay d3 = new StringDisplay("こんにちは");

		d1.display();
		d2.display();
		d3.display();
	}

}
