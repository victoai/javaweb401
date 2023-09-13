package testp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExTest {
	TestEx e = new TestEx();

	 
	void testGetMessage() {
		//fail("Not yet implemented");
		String result  = e.getMessage();		
		assertTrue(result.equals("hi"));
		
	}
	
	

	@Test
	void testg() {
		//fail("Not yet implemented");
		int result  = e.getSu();		
		assertTrue(result ==2);
		
	}

}
