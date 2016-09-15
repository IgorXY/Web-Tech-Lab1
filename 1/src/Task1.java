import java.util.Scanner;
import logic.Calculator;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x=");
		double x = scanner.nextDouble();
		System.out.print("y=");
		double y = scanner.nextDouble();
		
		scanner.close();
		Calculator calculator = new Calculator();
		Double result = calculator.Calculate(x,  y);
		
		if (result != null)
			System.out.println("Result="+result);
	}

}
