package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.*;

public class BasketTestCase {

	Basket basket = new Basket();
	@Test
	public void TestRightWeight() {
		Ball ball = new Ball("Blue", 1);
		basket.AddBall(ball);
		ball = new Ball("Red", 2);
		basket.AddBall(ball);
		ball = new Ball("Black", 6);
		basket.AddBall(ball);
		
		assertEquals(9, basket.CountWeight());
	}
	
	@Test
	public void TestRightColor() {
		Ball ball = new Ball("Blue", 1);
		basket.AddBall(ball);
		ball = new Ball("Red", 2);
		basket.AddBall(ball);
		ball = new Ball("Black", 6);
		basket.AddBall(ball);
		
		assertEquals(1, basket.CountBlueBalls());
	}

}
