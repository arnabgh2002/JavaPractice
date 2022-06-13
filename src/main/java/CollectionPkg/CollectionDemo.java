package CollectionPkg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {

	
	// To instantiate the List interface, we must use
	ArrayList<String> arrayListObj = new ArrayList();
	LinkedList<String> linkedListObj = new LinkedList();
	List<String> vectorObj = new Vector();
	List<String> stackObj = new Stack();

	// Set can be instantiated as
	HashSet<String> hs = new HashSet<String>();
	Set<String> lhs = new LinkedHashSet<String>();
	Set<String> ts = new TreeSet<String>();

	// Queue interface can be instantiated as
	PriorityQueue<String> priQueue = new PriorityQueue();
	ArrayDeque<String> arrayDeque = new ArrayDeque();
	
	// HashMap
	HashMap<String, String> hashMapObj=new HashMap<String, String>();

	public void ArrayListsDemo() {

		System.out.println("ArrayList Demo");

		// Adding Elements in ArrayList
		arrayListObj.add("BMW");
		arrayListObj.add("Maserati");
		arrayListObj.add("Mercedes-Benz");
		arrayListObj.add("Ford");
		arrayListObj.add("Mazda");
		arrayListObj.add("Tesla");

		System.out.println("Printing the arraylist object:: " + arrayListObj);

		System.out.println("Size of ArrayList is " + arrayListObj.size() + "");

		// Traversing list through Iterator
		Iterator itr = arrayListObj.iterator();
		System.out.println("\nTraversing the items in ArrayList");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Removing Ford Value from ArrayList");
		arrayListObj.remove("Ford");

		System.out.println("Printing Items after deletion");
		for (String s : arrayListObj) {
			System.out.println(s);
		}

		// Check whether element exists in ArrayList
		System.out.println("Search in Array List");
		if (arrayListObj.contains("Tesla")) {
			System.out.println("ArrayList Contains Tesla");
		}
	}

	public void LinkListDemo() {

		System.out.println("LinkList Demo");

		// Adding Elements in LinkList
		linkedListObj.add("BMW");
		linkedListObj.add("Maserati");
		linkedListObj.add("Mercedes-Benz");
		linkedListObj.add("Ford");
		linkedListObj.add("Mazda");
		linkedListObj.add("Tesla");

		System.out.println("Printing the linkedListObj :: " + linkedListObj);

		System.out.println("Size of ArrayList is " + linkedListObj.size() + "");

	}

	public void HashSetDemo() {
		System.out.println("HashSet Demo");
		hs.add("BMW");
		hs.add("Maserati");
		hs.add("Mercedes-Benz");
		hs.add("Ford");
		hs.add("Mazda");
		hs.add("Tesla");

		System.out.println("Printing the HashSetObj :: " + hs);

		// remove all elements
		System.out.println("Remove All Elements from HashSet using clear()");
		hs.clear();

		System.out.println("Printing the HashSetObj after deletion:: " + hs);
	}

	public void PriorityQueueDemo() {
		// adding items in queue
		priQueue.add("BMW");
		priQueue.add("Maserati");
		priQueue.add("Mercedes-Benz");
		priQueue.add("Ford");
		priQueue.add("Mazda");
		priQueue.add("Tesla");
		
		System.out.println("head:" + priQueue.element()); // returns head and throws exception when queue is empty.
		System.out.println("head:" + priQueue.peek()); // returns head if Queue is empty it returns null.

		System.out.println("iterating the queue elements:");
		Iterator itr = priQueue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(priQueue);
		
		priQueue.remove();
		priQueue.poll();
		Iterator itr1 = priQueue.iterator();
		System.out.println("after removing two elements:");
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
			}  
	}
	
	public void hashMapDemo() {
		
		hashMapObj.put("Arnab", "Capgemini");
		hashMapObj.put(null, "Hats Off Suthirtho");

		//adding values in HashMap
		for(int i=1;i<=4;i++) {
			hashMapObj.put("Key"+i, "FlatNo"+i);
		}
		
		System.out.println("HasMap contains:: "+hashMapObj.entrySet());
		
		//Printing Key Value Pairs
		for (Entry<String, String> str : hashMapObj.entrySet()) {
			System.out.println("Key="+str.getKey()+" :: Value="+str.getValue()+"");
		}
	}
}
