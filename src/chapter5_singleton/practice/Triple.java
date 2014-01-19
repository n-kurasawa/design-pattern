package chapter5_singleton.practice;

/**
 * インスタンスの数が3個に限定されているクラス
 * @author naohiro
 *
 */
public class Triple {
	public Triple(int id) {
		System.out.println("The instance " + id + "is created.");
		this.id = id;
	}

	private static Triple[] triples = new Triple[] {
		new Triple(0),
		new Triple(1),
		new Triple(2)
	};

	private int id;

	public static Triple getInstance(int id) {
		return triples[id];
	}
	public String toString() {
		return "[Triple id=" + id + "]";
	}
}
