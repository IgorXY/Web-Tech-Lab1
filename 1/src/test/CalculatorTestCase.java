package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.Calculator;

public class CalculatorTestCase {
	Double actual;
	Calculator calc = new Calculator();
	
	@Test
	public void TestRight() {		
		actual = calc.Calculate(0, 0);
		assertTrue(actual.compareTo(0.5) == 0);
	}
	
	@Test
	public void TestBigNumber() {		
		actual = calc.Calculate(999999999, 999999999);
	}

}
