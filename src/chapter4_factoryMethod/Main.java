package chapter4_factoryMethod;

import chapter4_factoryMethod.framework.Factory;
import chapter4_factoryMethod.framework.Product;
import chapter4_factoryMethod.idcard.IDCardFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("kurasawa");
		Product card2 = factory.create("tanaka");
		Product card3 = factory.create("suzuki");

		card1.use();
		card2.use();
		card3.use();

	}

}
