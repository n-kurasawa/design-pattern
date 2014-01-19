package chapter1_iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf_list implements Aggregate{
	List<Book> books;

	public BookShelf_list(int maxsize) {
		this.books = new ArrayList<Book>(maxsize);
	}
	public Book getBookAt(int index) {
		return books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
	}
	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfItrator_list(this);
	}

}
