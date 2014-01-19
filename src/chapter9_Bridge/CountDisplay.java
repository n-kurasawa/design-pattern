package chapter9_Bridge;

/**
 * 指定回数表示する<br>
 * 機能の階層
 * @author naohiro
 *
 */
public class CountDisplay extends Display {
	public CountDisplay(DisplayImple impl) {
		super(impl);
	}
	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}

}
