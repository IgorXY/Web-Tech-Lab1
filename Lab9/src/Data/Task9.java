package Data;

import java.util.Scanner;

import Logic.Ball;
import Logic.Basket;

public class Task9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N=");
		int n = scanner.nextInt();
		Basket basket = new Basket();
		String color;
		int weight;
		
		for(int i = 0; i< n; i++){
			scanner.nextLine();
			System.out.print("ball["+i+"] color =");
			color = scanner.nextLine();
			System.out.print("ball["+i+"] weight =");
			weight = scanner.nextInt();
			Ball ball = new Ball(color, weight);
			basket.AddBall(ball);
		}
		
		System.out.println(basket.CountBlueBalls());
		System.out.println(basket.CountWeight());

	}

}
