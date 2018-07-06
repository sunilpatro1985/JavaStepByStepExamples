package inheritanceEx1;

public class SavingsAcc extends BankAcc{
	
	int Balance;
	int Min_Balance = 1000;
	
	SavingsAcc(String Name, int AccNo, int Bal){
		super(Name, AccNo); //	BankAcc(String Name, int AccNo){ from BankAcc
		Balance = Bal;
	}
	
	String isMinBalMaintained() {
		if(Balance > Min_Balance) {
			return "Yes";
		}
		else
			return "No";
	}
	
	void DispCust() {
		super.DispCust();
		System.out.println("Balance - " + Balance);
		System.out.println("Is Min Balance Maintained? - " + isMinBalMaintained());
		
	}

	public static void main(String[] args) {
		SavingsAcc savingacc = new SavingsAcc("SKP", 4317625, 23400);
		savingacc.DispCust();
	}

}
