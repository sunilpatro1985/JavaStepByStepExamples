package condnloop;

public class WhileLoop {

	public static void main(String[] args) {
		int num = 10;
		
		/*while(num == 1) {
			System.out.println(num);
			num--;
		}*/
		
		do {
			System.out.println(num);
			num--;
		}while(num == 1);
		
	}
}
