package operators;

public class LogicalOp {
	public static void main(String[] args) {
		
		boolean Andresult = (2<3) && (3!=3); //true && false
		
		System.out.println(Andresult);
		
		boolean ORresult = (3<5) || (3!=4);
				System.out.println(ORresult);
				
				boolean negResult = !(true);
						System.out.println(negResult);
	}
}
