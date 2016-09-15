package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Logic.PrimeSeeker;

public class SeekerPrimeTestCase {
	PrimeSeeker ps = new PrimeSeeker();
	ArrayList<Integer> ali = new ArrayList<Integer>();
	
	@Test
	public void TestRight() {
		int[] array = {1, 2, 3, 4};
		ali = ps.SeekPrime(array);
		assertEquals(1, (int) ali.get(0));
		}
	
	@Test
	public void TestEmpty() {
		int[] array = null;
		ali = ps.SeekPrime(array);
		assertEquals(0, ali.size());
	}
	
	@Test
	public void TestNonePrime() {
		int[] array = {1, 6, 8, 10};
		ali = ps.SeekPrime(array);
		assertEquals(0, ali.size());
	}
	
	@Test
	public void TestZeroOne() {
		int[] array = {0, 1};
		ali = ps.SeekPrime(array);
		assertEquals(0, ali.size());
	}
	
	}


