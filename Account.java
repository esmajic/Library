public class Account {

	private int accountNumber;
	private String accountName;
	private int borrowedBooks;

	Account() {

	}

	Account(int accountNumber, String accountName, int borrowedBooks) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.borrowedBooks = borrowedBooks;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		if (isAccountNoNegative(accountNumber)) {
			this.accountNumber = getAccountNumber() * (-1);
		} else {
			this.accountNumber = accountNumber;
		}
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(int borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", borrowedBooks=" + borrowedBooks + "]";
	}

	public boolean isAccountNoNegative(int accountNumber) {
		if (getAccountNumber() < 0) {
			return true;
		} else
			return false;
	}
	
}

