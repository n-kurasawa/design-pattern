package chapter8_abstractFactory.listfactory;

import chapter8_abstractFactory.factory.*;


/**
 * Listの実装
 * @author naohiro
 *
 */
public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
	}
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<li>\n");
		builder.append(caption + "\n");
		builder.append("<ul>\n");
		for (Item item : items) {
			builder.append(item.makeHTML());
		}
		builder.append("</ul>\n");
		builder.append("</li>\n");
		return builder.toString();
	}
}
