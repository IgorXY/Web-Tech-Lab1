package Logic;

import java.util.ArrayList;

public class Basket {
	ArrayList<Ball> balls;
	
	public Basket(){
		this.balls=new ArrayList<Ball>();
	}
	
	public void AddBall(Ball ball){
		if(ball != null)
			balls.add(ball);
	}
	
	public int CountWeight(){
		int res=0;
		for(Ball ball : balls)
			res+=ball.weight;
		return res;			
	}
	
	public int CountBlueBalls(){
		int res=0;
		for(Ball ball : balls)
			if(ball.color.equals("Blue"))
				res++;
		return res;
	}

}
