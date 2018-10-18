package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayIterator {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("ABC");
		myList.add("DEF");
		myList.add("GHI");
		myList.add("JKL");
		myList.add("MNO");	
		
		System.out.println(myList);
		
		/*Iterator<String> iterator = myList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		/*for(String str : myList) {
			System.out.println(str);
		}*/
		
		for(int i=0 ; i < myList.size() ; i++) {
			System.out.println(myList.get(i));
		}
	}
}
