package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.SeekerToDelete;

public class SeekrtTestCase {
	SeekerToDelete std = new SeekerToDelete();
	Integer res;
	
	@Test
	public void TestRight() {
		int[] arr = {12, 8, 4, 5, 2, 10};
		res = std.FindCountToDrop(arr);
        assertEquals(3, (int)res);
	}
	
	@Test
	public void TestEquals() {
		int[] arr = {0, 0, 0, 0, 0, 0};
		res = std.FindCountToDrop(arr);
        assertEquals(5, (int)res);
	}
	
	@Test
	public void TestNull() {
		int[] arr = null;
		res = std.FindCountToDrop(arr);
        assertTrue(res == null);
	}
	
	@Test
	public void TestOne() {
		int[] arr = {0};
		res = std.FindCountToDrop(arr);
        assertEquals(0, (int)res);
	}

}
