package chapter8_abstractFactory.factory;

/**
 * 項目
 * (LinkとTrayのスーパークラス)
 * @author naohiro
 *
 */
public abstract class Item {
	public Item(String caption) {
		this.caption = caption;
	}

	// 見出し
	protected String caption;

	public abstract String makeHTML();

}
