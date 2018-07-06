package operators;

public class CondOp {

	public static void main(String[] args) {
		int result;
		int a = 8;
		int b = 7;
		
		result = (a < b) ? (a+b) : (a-b); //cond? true : false
		
		System.out.println(result);
	}
}
