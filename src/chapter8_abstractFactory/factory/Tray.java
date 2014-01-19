package chapter8_abstractFactory.factory;

import java.util.ArrayList;

/**
 * 複数のLink, Trayをひとまとまりにする抽象クラス
 * @author naohiro
 *
 */
public abstract class Tray extends Item {
	protected ArrayList<Item> items = new ArrayList<Item>();
	public Tray(String caption) {
		super(caption);
	}
	public void add(Item item) {
		items.add(item);
	}
}
