package inheritanceEx1;

public class Transactions extends SavingsAcc{
	
	int Withdrawl;
	int Deposit;
	
	Transactions(String Name, int AccNo, int Bal, int exp, int deposit){
		super(Name, AccNo, Bal);
		Withdrawl = exp;
		Deposit = deposit;
		Balance  += deposit;
		Balance -= exp;
	}
	
	void DispCust() {
		super.DispCust();
		System.out.println("Total Withdrawls - " + Withdrawl);
		System.out.println("Total Deposits - " + Deposit);
	}

	public static void main(String[] args) {
		Transactions trans =  new Transactions("SKP", 7642398, 23400, 1200, 3400);
		trans.DispCust();
	}

}
