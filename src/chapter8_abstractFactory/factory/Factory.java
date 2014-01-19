package chapter8_abstractFactory.factory;

/**
 * 抽象ファクトリークラス
 * インスタンスの生成、部品の生成を行う抽象クラス
 * @author naohiro
 *
 */
public abstract class Factory {
	/**
	 * インスタンス生成
	 * @param classname
	 * @return
	 */
	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("クラス " + classname + " が見つかりません。");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
