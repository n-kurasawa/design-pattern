package chapter8_abstractFactory.listfactory;

import chapter8_abstractFactory.factory.*;

/**
 * ファクトリークラスの実装
 * @author naohiro
 *
 */
public class ListFactory extends Factory {
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
}
