package chapter2_adapter.delegate;

/**
 * クライアント
 * @author naohiro
 *
 */
public class Main {

	public static void main(String[] args) {
		Print print = new PrintBanner("Hello");
		print.printWeak();
		print.printStrong();
	}

}
