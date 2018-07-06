package oopConcepts;

public class StudentParaConst {
	int RollNo; //instance variable
	String Name; //instance variable
	
	static String SchoolName = "ABC SCHOOL"; //class variable
	
	/*StudentParaConst(int roll, String name){ //parameterized constructor
		RollNo = roll;
		Name = name;
	}	*/
	
	StudentParaConst(int RollNo, String Name){ //parameterized constructor
			this.RollNo = RollNo;
			this.Name = Name;
	}
	
	public void DispDetails() {
		System.out.println("Name - " + Name + " | " + "Roll No - " + RollNo);
	}

	public static void main(String[] args) {
		StudentParaConst s1 = new StudentParaConst(123, "John");
		s1.DispDetails();
		System.out.println(SchoolName);		
	}
}
