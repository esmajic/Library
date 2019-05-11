import java.util.ArrayList;

public class AccountHandling extends Account {

	AccountHandling(int accountNumber, String accountName, int borrowedBooks) {
		super(accountNumber, accountName, borrowedBooks);

	}

	Account account1 = new Account();

	public boolean isAccountNoUnique(int accountNumber, ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			while (accounts.get(i).getAccountNumber() == accountNumber) {
				return true;
			}
		}
		return false;
	}

	public static boolean isAccountNumber(int accountNumber, ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				return false;
			}
		}
		return true;
	}

	public static int getAccountNumberIndex(int accountNumber, ArrayList<Account> accounts) {
		int i;
		for (i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber() == accountNumber) {
				return i;
			}
		}
		return i;
	}

	public static void listAllAccounts(ArrayList<Account> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(
					"* " + accounts.get(i).getAccountNumber() + ", " + accounts.get(i).getAccountName() + " *");
		}

	}

}
