package stringmethod;
public class Student {
	int RollNo;
	String Name;
	//String SchoolName = "ABC School";
	String SchoolName;
	Student(){
		SchoolName = "ABC SCHOOL";
	}
	/*Student(int roll, String name) {
		RollNo = roll;
		Name = name;
	}*/
	public void SetRoll(int roll, String name) {
		RollNo = roll;
		Name = name;
	}
	public void DispName(){
		System.out.println("Name - " + Name +" : " + "RollNo - " + RollNo);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.SetRoll(123,	"MyName");
		s1.DispName();
		System.out.println("SchoolName - "+s1.SchoolName);
		//Student s2 = new Student(234, "YourName");
		//s2.DispName();
		//System.out.println(s2.SchoolName);//will not work
	}
}

