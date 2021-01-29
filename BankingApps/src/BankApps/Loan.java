package BankApps;

public class Loan {
	public static void monthlyPayment() { 
	double loanAmount = 750;
	double loanTime =5;
	float interestRate=0.5f;
	
	if (loanAmount<= 0)
	{
		System.out.println("You have not taken any loan");
	} 
	else if (loanTime <= 0) 
	{
		System.out.println("Loan term should atleast be a year");
	} 
	else if (interestRate <= 0) 
	{
		System.out.println("Please provide correct interest rate");
	} 
	else {
		double monthlyPayment = ((loanAmount * loanTime * interestRate)/ 100);
		
		System.out.println("Your monthly payment is "+ monthlyPayment);
	}
	}}

