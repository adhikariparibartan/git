package BankApps;

public class SavingDeposit {
	public static void savingdeposit() {
		String name = "Star Ji";
		double amount = 1000;
		double balance = 50000;

		if (amount <= 0) {
			System.out.println("Amount to be deposited should be positive");
		} else {
			balance = balance + amount;
			System.out.println(name + " " + "Deposit amount is : " + amount+" $");
			System.out.println(name + " " + "Your balance Amount is : " + balance+ " $");
			System.out.println(" ");
			System.out.println("++++ Amount deposited successfully ++++");
		}

	}

}
