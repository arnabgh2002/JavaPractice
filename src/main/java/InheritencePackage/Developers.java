package InheritencePackage;

public class Developers extends Employee {

	float bonus = 10000;
	float totalSalary;

	public void salaryforDev() {
		totalSalary = bonus + baseSalary;
		System.out.println("Toatal Salary for Dev::-" + totalSalary);
	}

	// Invalid example for Overloading (It will throw compilation Error)
	// public float salaryforDev() {
	// totalSalary=bonus+baseSalary;
	// System.out.println("Toatal Salary for Dev::-"+totalSalary);
	// return totalSalary;
	// }

	// Method Overloading – Different Number of parameters in argument list
	public void salaryforDev(int SkillBonus) {
		totalSalary = bonus + baseSalary + SkillBonus;
		System.out.println("Toatal Salary for Dev::-" + totalSalary);
	}

	public void salaryforDev(String temp) {
		System.out.print(temp);
	}

	public void salaryforDev(String temp, int bonus) {

	}

	public void salaryforDev(int temp, String bonus) {

	}

	// Example of Overriding
	public void runBGtest() {
		System.out.println("Run Background test for Developers.");
	}

}
