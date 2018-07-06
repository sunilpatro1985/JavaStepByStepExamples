package pkg1;

public class BankAcc {
	
	private String CustName;
	private long AccNo;
	private static long Balance;
	
	protected void setCust(String name, long no) {
		CustName = name;
		AccNo = no;
	}
	
	protected void DisplayCust(long balance) {
		Balance = balance;
		System.out.println("Customer Name "+ CustName);
		System.out.println("Customer AccNo "+ AccNo);
		System.out.println("Customer Balance "+ Balance);
	}

}
