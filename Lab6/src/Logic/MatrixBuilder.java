package Logic;

public class MatrixBuilder {
	
	
	
	public int[][] BuildMatrix(int[] array)	{
		if(array == null)
			return null;
		int[][] matrix = new int[array.length][array.length];
		for(int i = 0; i<array.length; i++)
			for (int j = 0; j< array.length; j++)
				matrix[i][j] = array[(i+j) % array.length];
		return matrix;
	}

}
