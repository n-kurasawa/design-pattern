package chapter2_adapter.inheritance;

/**
 * あらかじめ提供されているとするクラス
 * アダプティー
 * @author naohiro
 *
 */
public class Banner {
	private String string;
	public Banner(String string) {
		this.string = string;
	}
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}

}
