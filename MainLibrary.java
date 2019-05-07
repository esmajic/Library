import java.util.ArrayList;
import java.util.Scanner;

public class MainLibrary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int option, accountNumber, borrowedBooks, bookNumber;
		int amountOfBorrowedBooks = 0;
		boolean bookStatus;
		String bookName, accountName, date;
		ArrayList<Account> accounts = new ArrayList<Account>();
		ArrayList<Book> books = new ArrayList<Book>();
		ArrayList<BorrowingBooks> borrowedBook = new ArrayList<>();

		do {

			System.out.println("=====================================");
			System.out.println("=        Welcome to Library         =");
			System.out.println("=====================================");
			System.out.println("");

			System.out.println("Select 1 to create new account ");
			System.out.println("Select 2 to register book");
			System.out.println("Select 3 to borrow book");
			System.out.println("Select 4 to list all accounts");
			System.out.println("Select 5 to list all book titles");
			System.out.println("Select 6 to list borrowed books");
			System.out.println("Select 0 to exit");
			System.out.println("");
			System.out.println("Please, choose desired option:  ");

			option = input.nextInt();

			if (option == 1) {
				System.out.println("");
				System.out.println("Creating account...");
				System.out.println("");
				System.out.println("Enter account number (up to 4 digits):  ");
				accountNumber = input.nextInt();
				input.nextLine();
				System.out.println("Enter account's owner name:  ");
				accountName = input.nextLine();
				System.out.println("Enter number of borrowed books:  ");
				borrowedBooks = input.nextInt();

				Account racuni = new Account(accountNumber, accountName,
						borrowedBooks);

				accounts.add(racuni);

				racuni.toString();
				System.out.println("");

			} else if (option == 2) {
				System.out.println("");
				System.out.println("Creating book number...");
				System.out.println("");
				System.out.println("Enter book number:  ");
				bookNumber = input.nextInt();
				System.out.println("Enter book title:  ");
				input.nextLine();
				bookName = input.nextLine();
				System.out.println("Is book available in library?:  ");
				bookStatus = input.nextBoolean();

				Book knjige = new Book(bookNumber, bookName, bookStatus);
				books.add(knjige);

				System.out.println("Book with the book number " + bookNumber
						+ " has been successfully entered in our data base!");
				System.out.println("");

			} else if (option == 3) {

				System.out.println("Borrowing a book...  ");
				System.out.println("");
				System.out.println("Enter book number: ");
				bookNumber = input.nextInt();
				System.out.println("Enter account number: ");
				accountNumber = input.nextInt();
				System.out.println("Enter date:");
				date = input.nextLine();
				System.out.println("");

				BorrowingBooks borrowed = new BorrowingBooks(bookNumber,
						accountNumber, date);

				borrowedBook.add(borrowed);

				borrowed.borrowBooks(accounts, books, accountNumber,
						bookNumber, amountOfBorrowedBooks, date);
				System.out.println("");

			} else if (option == 4) {
				System.out.println("List of registered accounts:");
				AccountHandling.listAllAccounts(accounts);
				System.out.println("");

			} else if (option == 5) {
				System.out.println("List of registered book titles:");
				BookHandling.listAllBooks(books);
				System.out.println("");

				System.out.println("");
			}

		} while (option != 0);

		System.out.println("Thank You for reading our books. Bye bye.");
		input.close();

	}
}
