package pkg2;

import pkg1.BankAcc;

public class ICICIBank extends BankAcc{

	public static void main(String[] args) {
		ICICIBank ib = new ICICIBank();
		ib.setCust("ICICI NAMe", 76869);
		//BankAcc.Balance = 890000;
		ib.DisplayCust(4343);
	}

}
