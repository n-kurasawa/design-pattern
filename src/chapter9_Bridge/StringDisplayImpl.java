package chapter9_Bridge;

/**
 * 文字列を使って表示する<br>
 * 実装の階層
 * @author naohiro
 *
 */
public class StringDisplayImpl extends DisplayImple {
	private String string;
	private int width;
	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}
	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
