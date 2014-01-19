package chapter6_prototype.framework;

import java.util.HashMap;

/**
 * クライアント
 * @author naohiro
 *
 */
public class Manager {
	private HashMap<String, Product> showcace = new HashMap<String, Product>();
	public void register(String name, Product proto) {
		showcace.put(name, proto);
	}
	public Product create(String protoname) {
		Product p = showcace.get(protoname);
		return p.createClone();
	}
}
