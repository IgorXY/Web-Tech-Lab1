package Data;

import java.util.Scanner;

import Logic.Mixer;


public class Task8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N=");
		int n = scanner.nextInt();
		
		double[] a = new double[n];
		for (int i=0; i<n; i++)		{
			System.out.print("a["+i+"]=");
			a[i] = scanner.nextDouble();
		}
		System.out.print("N=");
		int m = scanner.nextInt();
		
		double[] b = new double[m];
		for (int i=0; i<m; i++)		{
			System.out.print("b["+i+"]=");
			b[i] = scanner.nextDouble();
		}
		
		scanner.close();
		Mixer mixer = new Mixer();
		
		int[] array = mixer.MixArray(a, b);
		for (int i = 0; i< array.length; i++)
			System.out.print(array[i]+" ");


	}

}
