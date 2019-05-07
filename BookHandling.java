import java.util.ArrayList;

public class BookHandling extends Book {

	BookHandling(int bookNumber, String bookName, boolean bookAvailable) {
		super(bookNumber, bookName, bookAvailable);

	}

	public boolean isBookNoUnique(int bookNumber, ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			while (books.get(i).getBookNumber() == bookNumber) {
				return true;
			}
		}
		return false;
	}

	public static boolean isBookNumber(int bookNumber, ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			while (books.get(i).getBookNumber() == bookNumber) {
				return false;
			}
		}
		return true;
	}

	public static int getBookNumberIndex(int bookNumber, ArrayList<Book> books) {
		int i;
		for (i = 0; i < books.size(); i++) {
			if (books.get(i).getBookNumber() == bookNumber) {
				return i;
			}
		}
		return i;
	}

	public static void listAllBooks(ArrayList<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			System.out.println("* " + books.get(i).getBookName() + " *");
		}

	}

	public static boolean isBookAvailable(int bookNumber, ArrayList<Book> books) {
		while (books.get(getBookNumberIndex(bookNumber, books)).isBookAvailable()) {
			return false;
		}
		return true;

	}
}
