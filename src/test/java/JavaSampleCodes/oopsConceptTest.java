package JavaSampleCodes;

import org.testng.annotations.Test;

import AbstractClassPackage.Animal;
import AbstractClassPackage.Pig;
import EncapsulationPackage.EncapsulationDemo;
import InheritencePackage.Developers;
import InheritencePackage.Employee;
import InheritencePackage.Testers;

public class oopsConceptTest {
	@Test
	public void InheritanceTest() {

		Developers dev = new Developers();
		Testers tester = new Testers();
		dev.numberOfEmplyee();
		dev.salaryforDev();
		tester.salaryforTesters();
		tester.numberOfEmplyee();

	}

	@Test
	public void testOverloading() {
		Developers dev = new Developers();
		dev.salaryforDev();
		dev.salaryforDev(2000);
		dev.salaryforDev("Using String parameter");

	}

	@Test
	public void testOverriding() {
		Developers dev = new Developers();
		Testers tester = new Testers();
		dev.runBGtest();
		tester.runBGtest();
	}

	@Test
	public void AbstractClassTest() {
//		Animal ani=new Animal(); //compile error as user cannot create object of an Abstract class.
		Pig myPig = new Pig(); // Create a Pig object

		// Method animalSound() is declared in Abstract class (Animal) and the method is
		// defined in Inherited Class which is Pig
		myPig.animalSound();
		myPig.sleep();
	}

	@Test
	public void InterfaceTest() {
		InterfacePackage.Pig myPig = new InterfacePackage.Pig();
		myPig.animalSound();
		myPig.sleep();
	}

	@Test
	public void EncapsulationTest() {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setEmpSSN(112233);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}

}
