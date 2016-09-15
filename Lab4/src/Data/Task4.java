package Data;

import java.util.ArrayList;
import java.util.Scanner;

import Logic.PrimeSeeker;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N=");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		for (int i=0; i<n; i++)		{
			System.out.print("array["+i+"]=");
			array[i] = scanner.nextInt();
		}
		
		PrimeSeeker primeSeeker = new PrimeSeeker();
		ArrayList<Integer> indexArray = primeSeeker.SeekPrime(array);
		
		for(int i = 0; i<indexArray.size(); i++)
			System.out.println(indexArray.get(i));

	}

}
