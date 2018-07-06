package stringmethod;

public class StringExamples {

	public static void main(String[] args) {
		String str = "hello world 123";
		
		String MyStr = new String("My world is great!");
		
		System.out.println("str - " + str);
		System.out.println("MyStr - " + MyStr);
		
		char data[] = {'h', 'e', 'y'};
		String CharString = new String(data);
		//System.out.println(CharString);
		
		System.out.println(str.charAt(6)); //returns the character present exactly on specified index
		System.out.println(str.substring(6)); //returns the rest of the string from the specified index, 6th index to end of string/index
		System.out.println(str.substring(6, 13)); //returns the string from begin to end index, 6th index to a particular index/specified index
		
		System.out.println(str.concat("4567")); // str = str+"4567"
		System.out.println(str.concat(CharString)); //str = str + CharString
		
		System.out.println(str.indexOf("world"));
		System.out.println(CharString.indexOf('e'));
		
		System.out.println(str.contains("123"));
		System.out.println(str.contains("Hello"));
		
		//System.out.println(str.equals("1234456"));
		
		System.out.println(str.toUpperCase());
		
		String str1 = "Hello";
		String  str2 = "hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String TrimeMyString = "     123ASDF    ";
		System.out.println(TrimeMyString);
		System.out.println(TrimeMyString.trim());
		
		//System.out.println(str1.replace('H', 'Y'));
		String ReplacedString = null;
		ReplacedString = str1.replace('H', 'Y');
		System.out.println(ReplacedString);
		System.out.println(ReplacedString.length());
		
	}

}
