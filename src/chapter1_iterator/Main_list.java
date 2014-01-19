package chapter1_iterator;

public class Main_list {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookShelf_list bookShelf = new BookShelf_list(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs_2"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
