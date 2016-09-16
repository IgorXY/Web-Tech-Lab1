package Data;

import java.util.Scanner;

import Logic.MatrixBuilder;

public class Task6 {
	
	public static void DisplayMatrix(int[][] m){
		for(int i = 0; i< m.length; i++){
			for(int j=0; j<m[i].length; j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N=");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		for (int i=0; i<n; i++)		{
			System.out.print("array["+i+"]=");
			array[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		MatrixBuilder mb = new MatrixBuilder();
		int[][] matrix = mb.BuildMatrix(array);
		
		DisplayMatrix(matrix);
		

	}

}
