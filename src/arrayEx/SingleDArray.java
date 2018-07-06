package arrayEx;

import java.util.Arrays;

public class SingleDArray {

	public static void main(String[] args) {
		
		//int Arr[] = {1, 12, 23, 76, -9};
		
		//String str[] = {"xyz", "abc", "ugs"};
		//char cr[] = {'s', 'r', 't', 'y'};
		
		//OR
		int Arr[] = new int[5];
		Arr[0] = 12;
		Arr[1] = 6;
		Arr[2] = 9;
		Arr[3] = 10;
		Arr[4] = 76;
		
		/*System.out.println("Value at index 3 - " + Arr[3]);
		System.out.println("Length of the array is - "+ Arr.length );
		
		System.out.println("Elements of the array are - ");
		for(int i=0 ; i < Arr.length ; i++) {
			System.out.println(Arr[i]);
		}*/
		
		System.out.println(Arrays.toString(Arr));
	}
}
