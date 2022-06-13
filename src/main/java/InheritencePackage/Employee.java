package InheritencePackage;

public class Employee {

	int totalNoOfEmp=20;
	float baseSalary= 50000;
	
	public void numberOfEmplyee() {
		System.out.println("Total Number of Employee::-"+totalNoOfEmp);
	}
	
	//Method to demonstrate Overriding.
	public void runBGtest() {
		System.out.println("Run Background test for Developers and Testers");
	}
}

