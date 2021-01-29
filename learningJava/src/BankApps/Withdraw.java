package BankApps;

public class Withdraw {
	public static void withdraw() {
		String name = "Star ji";
		double amount = 0;
		double balance = 5000;
		if (amount <= 0) {
			System.out.println("Amount to be withdrawn should not be zero"+ " "+ name);
		} else {
			if (balance < amount) {
				System.out.println("Insufficient balance");
			} else {
				balance = balance - amount;
				System.out.println(name + " Your Withdraw amount is: " + amount+ " $");
				System.out.println(name + " Your Balance amount is : " + balance +" $");
				System.out.println(" ");
				 System.out.println("++++ Amount withdrawn successfully ++++");

			}
		}
	}
}
