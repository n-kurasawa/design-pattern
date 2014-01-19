package chapter9_Bridge;

public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Univarse"));
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Ranom"));
		CountDisplay d5 = new CountDisplay(new FileDisplayImpl("newfile.txt"));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.randomDisplay(15);
		d5.multiDisplay(3);
	}
}
