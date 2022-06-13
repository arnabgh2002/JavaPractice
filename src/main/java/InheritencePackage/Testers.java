package InheritencePackage;

public class Testers extends Employee{

	float bonus= 4000;
	float totalSalary;
	
	public void salaryforTesters() {
		totalSalary=bonus+baseSalary;
		System.out.println("Toatal Salary for Testers::-"+totalSalary);
	}
	
	//Example of Overriding 
	public void runBGtest() {
		System.out.println("Run Background test for Testers");
	}
}