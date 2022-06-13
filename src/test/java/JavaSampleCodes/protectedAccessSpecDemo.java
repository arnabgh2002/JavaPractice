package JavaSampleCodes;

import AccessSpecifierPackage.ProtectedAccessSpecifier;

public class protectedAccessSpecDemo extends ProtectedAccessSpecifier{

	public static void main(String args[]){
		protectedAccessSpecDemo obj=new protectedAccessSpecDemo();
		System.out.println(obj.addTwoNumbers(10, 20));
	}
}
