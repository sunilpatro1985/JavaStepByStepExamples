package mypackage;

public class ClassArray {

	public static void main(String[] args) {
	
		Employee Emp[] = new Employee[3];
		
		Emp[0] = new Employee(12, "XYZ") ;
		Emp[1] = new Employee(21, "ABC") ;
		Emp[2] = new Employee(32, "DEF"); 
		
		for(int i=0; i < Emp.length ; i++) {
			System.out.println("ID - " + Emp[i].ID + ", Name - " + Emp[i].Name);
		}
	}

}

class Employee{
	int ID;
	String Name;
	
	Employee(int ID, String Name){
		this.ID = ID;
		this.Name = Name;
	}
}