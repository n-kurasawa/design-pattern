package chapter9_Bridge;

/**
 * 何かを表示するクラス
 * 「機能のクラス」の最上位
 * @author naohiro
 *
 */
public class Display {
	private DisplayImple impl;
	public Display(DisplayImple impl) {
		this.impl = impl;
	}
	public void open() {
		impl.rawOpen();
	}
	public void print() {
		impl.rawPrint();
	}
	public void close() {
		impl.rawClose();
	}
	public final void display() {
		open();
		print();
		close();
	}
}
