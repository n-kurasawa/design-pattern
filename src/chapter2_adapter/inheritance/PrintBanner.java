package chapter2_adapter.inheritance;

/**
 * あらかじめ与えられていたものを今必要なものに適合させる
 * アダプター
 * @author naohiro
 *
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
