package AccessControl;

import java.util.ArrayList;

public class LoopsDemo {

	int i = 2;

	public void demoForLoop() {
		
		System.out.println("General For Loop Syntax 'for (initialExpression; testExpression; updateExpression)'");
		for (int i = 0; i <= 5; i++) {
			System.out.println("value of i = " + i);
		}

		System.out.println("Demo For Loop without initializing in for loop block");
		for (; i <= 5; i++) {
			System.out.println("value of i = " + i);
		}

		System.out.println("For Each || Syntax :: 'for(dataType item : array)' ");
//		ArrayList<String> cars = new ArrayList<String>();
//		cars.add("Maruti");
//		cars.add("Hyundai");
//		cars.add("Ford");
//		cars.add("BMW");
		String array[]= {"Maruti","Hyundai","Ford"};
		for (String i : array) {
			System.out.println("Cars in the ArrayList --> " + i);
		}
		for (int i = 0; i <3; i++) {
			System.out.println("value of i = " + array[i]);
			if(i==1) 
				break;
		}
		
	}

	public void demoWhileLoop() {
		int i=1;
		
		while(i<10) {
			System.out.println("Print current value of i = "+i);
			i++;
		}
	}
	
	public void doWhileLoop() {
		int i=1;
		System.out.println("Demo do while loop::");
		do {
			System.out.println("Current Value of i ="+i);
			i++;
		}while(i<=5);
	}
}
