package BankApps;

public class MainBank {

	public static void main(String[] args) {

		//calling methord for Saving
		System.out.println("---   --- -- SAVING DEPOSIT---  ---   ---");
		System.out.println("                                            ");
		SavingDeposit saving_deposit = new SavingDeposit();
		saving_deposit.savingdeposit();
		
		System.out.println("--------------------------------------------- ");
		
		//Calling methord for withdraw
		System.out.println("                                             ");
		System.out.println("---  ---  --- WITHDRAW AMOUNT---  ---  --");
		System.out.println("                                             ");
		Withdraw withdraw_amount = new Withdraw();
		withdraw_amount.withdraw();
		
		System.out.println(" ");
		//loan
		System.out.println("Loan Calcualtion");
		Loan.monthlyPayment();
		
	}

}
