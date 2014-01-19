package chapter1_iterator;

public class BookShelfItrator_list implements Iterator {

	private BookShelf_list bookShelf;
	private int index;
	public BookShelfItrator_list(BookShelf_list bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
