package chapter13_visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
	private String name;
	private List<Entry> dir = new ArrayList<Entry>();
    public Directory(String name) {
        this.name = name;
    }

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> iterator = dir.iterator();
		while (iterator.hasNext()) {
			Entry entry = iterator.next();
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public Iterator<Entry> iterator() {
		return dir.iterator();
	}

    @Override
    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

}
