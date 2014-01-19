package chapter9_Bridge;

/**
 * ランダム回数表示する
 * 機能の階層
 * @author naohiro
 *
 */
public class RandomDisplay extends Display {

	public RandomDisplay(DisplayImple impl) {
		super(impl);
	}

	public void randomDisplay(int times) {
		open();
		int random = (int)(Math.random() * times);
		for (int i = 0; i < random; i++) {
			print();
		}
		close();
	}

}
