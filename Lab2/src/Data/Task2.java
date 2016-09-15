package Data;

import java.util.Scanner;

import Logic.DotChecker;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x=");
		double x = scanner.nextDouble();
		System.out.print("y=");
		double y = scanner.nextDouble();
		
		scanner.close();
		
		DotChecker dotChecker = new DotChecker();
		System.out.print(dotChecker.CheckDot(x, y));
	}

}
