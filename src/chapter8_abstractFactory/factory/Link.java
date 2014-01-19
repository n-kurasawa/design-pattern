package chapter8_abstractFactory.factory;

/**
 * HTMLのLinkを表す抽象クラス
 * @author naohiro
 *
 */
public abstract class Link extends Item {
	protected String url;
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
}
