package chapter12_display;

/**
 * 複数業からなる文字列を表示するクラス
 * @author naohiro
 *
 */
public abstract class Display {
	public abstract int getColumns();
	public abstract int getRows();
	public abstract String getRowText(int row);
	public final void show() {
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
