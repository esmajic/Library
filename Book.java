public class Book {

	private int bookNumber;
	private String bookName;
	private boolean bookAvailable;

	Book() {

	}

	Book(int bookNumber, String bookName, boolean bookAvailable) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookAvailable = bookAvailable;

	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		if (isBookNoNegative(bookNumber)) {
			this.bookNumber = getBookNumber() * (-1);
		} else {
			this.bookNumber = bookNumber;
		}
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isBookAvailable() {
		return bookAvailable;
	}

	public void setBookAvailable(boolean bookAvailable) {
		this.bookAvailable = bookAvailable;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName
				+ ", bookAvailable=" + bookAvailable + "]";
	}

	public boolean isBookNoNegative(int bookNumber) {
		if (getBookNumber() < 0) {
			return true;
		} else
			return false;
	}

}
