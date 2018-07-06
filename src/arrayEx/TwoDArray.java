package arrayEx;

public class TwoDArray {

	public static void main(String[] args) {
		int Arr2D[][] = {{1,3,23,21,34,54,5}, {21, 32, 34, 65, -98, 98, -3}};
		
		//1st row = 1 3 23 21 34 54 5
		//2nd row = 21 32 34 65 -98 98 -3
		
		System.out.println(Arr2D[1][2]);
		System.out.println(Arr2D.length); // no of rows as length
		System.out.println(Arr2D[0].length);
		System.out.println(Arr2D[1].length);
		
		for(int i = 0 ; i < Arr2D.length ; i++) {
			for(int j = 0 ; j < Arr2D[i].length ; j++) {
				System.out.print(Arr2D[i][j] + " ");
			}
			System.out.println();
		}
	}

}
