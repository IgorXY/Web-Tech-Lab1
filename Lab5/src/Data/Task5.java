package Data;

import java.util.Scanner;

import Logic.SeekerToDelete;

public class Task5 {

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
		SeekerToDelete std = new SeekerToDelete();
		Integer result = std.FindCountToDrop(array);
		if(result != null)
			System.out.println(result);

	}

}
