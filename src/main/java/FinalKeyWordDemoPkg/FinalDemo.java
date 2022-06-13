package FinalKeyWordDemoPkg;

public class FinalDemo {

	final int a = 10;

	public final class A {
		A() {
			System.out.println("Inside class A");
			// a=12; // varriable a is final means it cannot be changed
		}

	}

	// final method cannot be overriden
	public final void finalMethod() {
		System.out.println("Inside Final Method in Class A");
	}

	 //Class A cannot be inherihed as it is final
	 public class B extends A{
	
	 }

}
