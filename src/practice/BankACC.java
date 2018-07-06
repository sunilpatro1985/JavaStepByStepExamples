package practice;

interface BankACC {
	
	double StartingBal = 1000;
	void EnterCustName(String CustName);
	void EnterCustAccNo(long AccNo);
	void Deposit(double Amount);
	void Withdrawl(double Amount);
	void DispCustDetails();
}
