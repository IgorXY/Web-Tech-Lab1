package Data;

import java.util.Scanner;

import Logic.Counter;

public class Task3 {
	/**Display result table*/
	static void DisplayResult(double[] tr, double a, double h){
		if(tr != null)
			for (int i = 0; i<tr.length; i++)
			{
				System.out.print(a+i*h);
				System.out.print(" ");
				System.out.print(tr[i]);
				System.out.println();
				}
		}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a=");
		double a = scanner.nextDouble();
		System.out.print("b=");
		double b = scanner.nextDouble();
		System.out.print("h=");
		double h = scanner.nextDouble();
		
		scanner.close();
		
		Counter counter = new Counter();
		double[] tabRes = counter.CountFunction(a,  b,  h);
		DisplayResult(tabRes, a, h);
	}

}
