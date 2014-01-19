package chapter13_visitor;

public interface Element {
	public abstract void accept(Visitor visitor);
}