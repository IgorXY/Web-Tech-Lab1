package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.Counter;

public class CounterTestCase {
	Counter counter = new Counter();
	double res[];
	@Test
	public void TestRight() {
		res = counter.CountFunction(0, 0, 0);
		assertEquals(0, res[0], 0);
	}

}
