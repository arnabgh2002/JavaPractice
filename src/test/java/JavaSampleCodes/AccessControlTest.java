package JavaSampleCodes;

import org.testng.annotations.Test;

import AccessControl.LoopsDemo;
import ifElsePackage.ifEleseDemo;

public class AccessControlTest {

	@Test
	public void demoLoop() {
		LoopsDemo loop=new LoopsDemo();
		loop.demoForLoop();
	}
	
	@Test
	public void demoWhileLoopTest() {
		LoopsDemo loop=new LoopsDemo();
		loop.demoWhileLoop();		
		loop.doWhileLoop();
	}
	
	@Test
	public void testIfElse() {
		ifEleseDemo ifElse=new ifEleseDemo();
		ifElse.ifElseLogic("sre");
	}
}
