package chapter13_visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String curentdir = "";

	@Override
	public void visit(File file) {
		System.out.println(curentdir + "/" + file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(curentdir + "/" + directory);
		String savedir = curentdir;
		curentdir = curentdir + "/" + directory.getName();
		Iterator<Entry> iterator = directory.iterator();
		while (iterator.hasNext()) {
			Entry entry = iterator.next();
			entry.accept(this);
		}
		curentdir = savedir;
	}
}
