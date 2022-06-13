package JavaTraining.Java;

import InheritencePackage.Developers;
import InheritencePackage.Testers;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Developers dev = new Developers();
		Testers tester = new Testers();
		dev.numberOfEmplyee();
		dev.salaryforDev();
		tester.salaryforTesters();
		tester.numberOfEmplyee();
    }
}
