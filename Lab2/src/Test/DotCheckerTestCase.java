package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.DotChecker;

public class DotCheckerTestCase {
	DotChecker dotChecker = new DotChecker();
	
	@Test
	public void TestRight() {
		assertTrue(dotChecker.CheckDot(1, 1));
	}
	
	@Test
	public void TestZero() {
		assertTrue(dotChecker.CheckDot(0, 0));
	}
	
	@Test
	public void TestWrong() {
		assertFalse(dotChecker.CheckDot(100, 0));
	}
	
	@Test
	public void TestNearRight() {
		assertTrue(dotChecker.CheckDot(3.999999, 4.999999));
	}
	
	@Test
	public void TestNearWrong() {
		assertFalse(dotChecker.CheckDot(4.000001, 5.000001));
	}

}
