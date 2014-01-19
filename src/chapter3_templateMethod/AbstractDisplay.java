package chapter3_templateMethod;

/**
 * テンプレートメソッドを実装しているクラス
 * @author naohiro
 *
 */
public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();

	// テンプレートメソッド
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
