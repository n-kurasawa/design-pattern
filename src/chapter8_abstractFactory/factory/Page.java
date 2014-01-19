package chapter8_abstractFactory.factory;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 * HTMLページ全体を表現したページ
 * @author naohiro
 *
 */
public abstract class Page {
	protected String title;
	protected String author;
	protected  ArrayList<Item> content = new ArrayList<Item>();
	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	/**
	 * 表示する内容を追加
	 * @param item
	 */
	public void add(Item item) {
		content.add(item);
	}

	/**
	 * ファイル出力
	 */
	public void output() {
		try {
			String filename = title + ".html";
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(filename), "UTF8"));
			pw.write(this.makeHTML());
			pw.close();
			System.out.println(filename + "を作成しました。");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * HTMLを生成
	 * @return
	 */
	public abstract String makeHTML();
}
