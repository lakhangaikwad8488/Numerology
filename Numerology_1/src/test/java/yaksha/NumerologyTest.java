  package test.java.yaksha;
  
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.java.yaksha.Numerology;
import main.java.yaksha.TestUtils;

class NumerologyTest {

	@Test
	 void testFindValue() throws IOException {
		 //assertEquals(17,  Numerology.findValue("LAKHAN"));
		// assertEquals(-1,  Numerology.findValue("Arti"));
	//	TestUtils.yakshaAssert(TestUtils.currentTest(),
		//MainClass.printCapitalized("world is beautiful").
		//equals("World Is Beautiful")==true?"true":"false",
			//	TestUtils.businessTestFile);
		

		 TestUtils.yakshaAssert(TestUtils.currentTest(),Numerology.findValue("LAKHAN")==17==true?"true":"false",TestUtils.businessTestFile);
	}

}
