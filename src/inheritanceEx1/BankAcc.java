package inheritanceEx1;

public class BankAcc {
	
	String Cust_Name;
	int CustAcc_No;
	
	BankAcc(String Name, int AccNo){
		Cust_Name = Name;
		CustAcc_No = AccNo;
	}
	
	void DispCust() {
		System.out.println("Customer Name - " + Cust_Name);
		System.out.println("Customer Acc No - " + CustAcc_No);
	}
	
	

}
