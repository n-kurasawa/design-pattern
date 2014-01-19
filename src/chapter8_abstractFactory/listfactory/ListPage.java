package chapter8_abstractFactory.listfactory;

import chapter8_abstractFactory.factory.*;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<html><head><title>" + title + "</title></head>\n");
		builder.append("<body>\n");
		builder.append("<h1>" + title + "</h1>\n");
		builder.append("<ul>\n");
		for (Item item : content) {
			builder.append(item.makeHTML());
		}
		builder.append("</ul>\n");
		builder.append("<hr><adress>" + author + "</adress>");
		builder.append("</body></html>\n");

		return builder.toString();
	}
}
