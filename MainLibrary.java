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

			System.out.println("\n=====================================");
			System.out.println("=        Welcome to Library         =");
			System.out.println("=====================================");
			
			System.out.println("\nSelect 1 to create new account ");
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
				System.out.println("\nCreating account...");
				System.out.println("\nEnter account number (up to 4 digits):  ");
				accountNumber = input.nextInt();
				input.nextLine();
				System.out.println("Enter account's owner name:  ");
				accountName = input.nextLine();
				System.out.println("Enter number of borrowed books:  ");
				borrowedBooks = input.nextInt();

				Account racuni = new Account(accountNumber, accountName, borrowedBooks);
				accounts.add(racuni);
				racuni.toString();

			} else if (option == 2) {
				System.out.println("\nCreating book number...");
				System.out.println("\nEnter book number:  ");
				bookNumber = input.nextInt();
				System.out.println("Enter book title:  ");
				input.nextLine();
				bookName = input.nextLine();
				System.out.println("Is book available in library?:  ");
				bookStatus = input.nextBoolean();

				Book knjige = new Book(bookNumber, bookName, bookStatus);
				books.add(knjige);

				System.out.println("\nBook with the book number " + bookNumber
						+ " has been successfully entered in our data base!");

			} else if (option == 3) {

				System.out.println("\nBorrowing a book...  ");
				System.out.println("\nEnter book number: ");
				bookNumber = input.nextInt();
				System.out.println("Enter account number: ");
				accountNumber = input.nextInt();
				System.out.println("Enter present date:");
				date = input.nextLine();

				BorrowingBooks borrowed = new BorrowingBooks(bookNumber, accountNumber, date);

				borrowedBook.add(borrowed);

				borrowed.borrowBooks(accounts, books, accountNumber, bookNumber, amountOfBorrowedBooks, date);

			} else if (option == 4) {
				System.out.println("\nList of registered accounts:");
				AccountHandling.listAllAccounts(accounts);

			} else if (option == 5) {
				System.out.println("\nList of registered book titles:");
				BookHandling.listAllBooks(books);

			}

		} while (option != 0);

		System.out.println("\nThank You for reading our books. Bye bye.");
		input.close();

	}
}
