package chapter4_factoryMethod.idcard;

import java.util.HashMap;

import chapter4_factoryMethod.framework.Factory;
import chapter4_factoryMethod.framework.Product;

public class IDCardFactory extends Factory {
	private HashMap<Integer, String> database = new HashMap<Integer, String>();
	private int serial = 100;

	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		String owner = ((IDCard) product).getOwner();
		int serial = ((IDCard) product).getSerial();
		database.put(new Integer(serial), owner);
	}

	public HashMap<Integer, String> getDatabase() {
		return database;
	}
}
