package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilTest {

	
	Util u= new Util();
	@Test
	void test() {
		//fail("Not yet implemented");
		 int[] expectedArr=  {1,2,3,6}  ;
		 assertArrayEquals( expectedArr , u.getYak(6)); 
		 //assertArrayEquals(new int[] {1,2,3,6}, u.getYak(6)); 
	}

}
