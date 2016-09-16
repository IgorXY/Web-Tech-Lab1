package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.MatrixBuilder;

public class MatrixBuilderTestCase {
	MatrixBuilder mb = new MatrixBuilder();

	@Test
	public void TestRight() {
		int[] arr = {1, 2, 3};
		int[][] matrix = mb.BuildMatrix(arr);
		assertArrayEquals(arr, matrix[0]);		
	}

}
