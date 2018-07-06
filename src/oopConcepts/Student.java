package oopConcepts;

public class Student {
	int RollNo; //instance variable
	String Name; //instance variable
	
	//static String SchoolName = "ABC SCHOOL"; //class variable
	String SchoolName;
	
	public void InsertData(int roll, String name) { //roll and name are my local variables
		RollNo = roll;
		Name = name;
	}
	
	Student(){ //default constructor
		SchoolName = "ABC SCHOOL";
	}	
	
	public void DispDetails() {
		System.out.println("Name - " + Name + " | " + "Roll No - " + RollNo);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.InsertData(123, "Ram");
		s1.DispDetails();
		System.out.println(s1.SchoolName);
		//System.out.println(SchoolName);
		
		Student s2 = new Student();
		//s2.InsertData(roll, name);	
	}
}
