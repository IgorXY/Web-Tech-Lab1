package Data;

import java.util.Scanner;

import Logic.ShellSorter;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N=");
		int n = scanner.nextInt();
		
		double[] array = new double[n];
		for (int i=0; i<n; i++)		{
			System.out.print("array["+i+"]=");
			array[i] = scanner.nextDouble();
		}
		
		scanner.close();
		ShellSorter ss = new ShellSorter();
		ss.Sort(array);
		
		for (int i = 0; i< array.length; i++)
			System.out.print(array[i]+" ");

	}

}
