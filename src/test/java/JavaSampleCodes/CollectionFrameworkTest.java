package JavaSampleCodes;

import org.testng.annotations.Test;

import CollectionPkg.CollectionDemo;

public class CollectionFrameworkTest {

	@Test
	public void arrayListTest() {
		CollectionDemo collectionObj=new CollectionDemo();
		collectionObj.ArrayListsDemo();
//		collectionObj.LinkListDemo();
	}
	
	@Test
	public void LinkListTest() {
		CollectionDemo collectionObj=new CollectionDemo();		
		collectionObj.LinkListDemo();
	}
	
	@Test
	public void HashSetTest() {
		CollectionDemo collectionObj=new CollectionDemo();		
		collectionObj.HashSetDemo();
	}
	
	@Test
	public void PriorityQueueTest() {
		CollectionDemo collectionObj=new CollectionDemo();		
		collectionObj.PriorityQueueDemo();
	}
	
	@Test
	public void hashMapTest() {
		CollectionDemo collectionObj=new CollectionDemo();		
		collectionObj.hashMapDemo();
	}
	
}
