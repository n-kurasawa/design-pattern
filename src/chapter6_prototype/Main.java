package chapter6_prototype;

import chapter6_prototype.framework.Manager;
import chapter6_prototype.framework.Product;

public class Main {
	public static void main(String[] args) {
		// 準備
		Manager manager = new Manager();
		Underline uline = new Underline('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("storong message", uline);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);

		// 生成
		Product p1 = manager.create("storong message");
		p1.use("Hello, world");

		Product p2 = manager.create("warning box");
		p2.use("Hello, world");

		Product p3 = manager.create("slash box");
		p3.use("Hello, world");
	}
}
