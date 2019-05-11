import java.util.ArrayList;

public class BorrowingBooks {

	private String date;
	private int bookNumber;
	private int accountNumber;

	BorrowingBooks() {

	}

	BorrowingBooks(int bookNumber, int accountNumber, String date) {
		this.bookNumber = bookNumber;
		this.accountNumber = accountNumber;
		this.date = date;

	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void borrowBooks(ArrayList<Account> accounts, ArrayList<Book> books, int accountNumber, int bookNumber,
			int amountOfBorrowedBooks, String date) {
		if (AccountHandling.isAccountNumber(accountNumber, accounts)) {
			System.out.println("\nAccount does not exist in our accounts data base! Please, try again.");
		} else if (BookHandling.isBookNumber(bookNumber, books)) {
			System.out.println("\nBook number does not exist in our books data base! Please, try again.");
		} else if (BookHandling.isBookAvailable(bookNumber, books)) {
			System.out.println("\nPresently, book is not available. Please, try another book.");
		} else if (accounts.get(AccountHandling.getAccountNumberIndex(accountNumber, accounts))
				.getBorrowedBooks() >= 3) {
			System.out.println("\nThree books have already been borrowed. Limit has been reached. Return books.");
		} else {
			books.get(BookHandling.getBookNumberIndex(bookNumber, books)).setBookAvailable(false);
			accounts.get(AccountHandling.getAccountNumberIndex(accountNumber, accounts))
					.setBorrowedBooks(amountOfBorrowedBooks + 1);
			System.out.println("\nBook is successfully issued to member with account number " + accountNumber);
			amountOfBorrowedBooks++;
			System.out.println("\nStatus of borrowed books is:  " + amountOfBorrowedBooks);
		}

	}
}
