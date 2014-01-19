package chapter4_factoryMethod.framework;

/**
 * クリエイター
 * @author naohiro
 *
 */
public abstract class Factory {
	public final Product create(String ownew) {
		Product p = createProduct(ownew);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
