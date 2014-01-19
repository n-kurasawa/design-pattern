package chapter8_abstractFactory.listfactory;

import chapter8_abstractFactory.factory.*;

/**
 * Linkの実装
 * @author naohiro
 *
 */
public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption, url);
	}
	public String makeHTML() {
		return "	<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}
}
