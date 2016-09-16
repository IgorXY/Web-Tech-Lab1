package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.ShellSorter;

public class ShellSortCaseTest {
	ShellSorter shellSorter = new ShellSorter();

	@Test
	public void TestRight() {
		double[] a={2, 5.1,  2.1, 10.434, 3};
		double[] aSorted = {2, 2.1, 3, 5.1, 10.434};
		shellSorter.Sort(a);
		assertArrayEquals(aSorted, a, 0);
	}
	
	@Test
	public void TestNull() {
		double[] a=null;
		shellSorter.Sort(a);
		assertTrue(a == null);
	}
	
	@Test
	public void TestZero() {
		double[] a={0, 0,  0, 0, 0};
		double[] aSorted = {0, 0, 0, 0, 0};
		shellSorter.Sort(a);
		assertArrayEquals(aSorted, a, 0);
	}

}
