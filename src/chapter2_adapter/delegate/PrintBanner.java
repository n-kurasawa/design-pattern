package chapter2_adapter.delegate;

/**
 * あらかじめ与えられていたものを今必要なものに適合させる
 * アダプター
 * @author naohiro
 *
 */
public class PrintBanner extends Print{
	private Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}


}
