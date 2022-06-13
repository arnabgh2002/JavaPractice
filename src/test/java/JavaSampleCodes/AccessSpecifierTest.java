package JavaSampleCodes;

import org.testng.annotations.Test;

import AccessSpecifierPackage.PrivateAccessSpecifier;

public class AccessSpecifierTest {
	@Test
	public void privateTestDemo() {
		PrivateAccessSpecifier obj = new PrivateAccessSpecifier();
		
//		System.out.println(obj.num); // compilation error
//		System.out.println(obj.square(10)); // compilation error
	}
	
}
