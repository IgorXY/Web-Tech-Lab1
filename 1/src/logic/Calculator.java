package logic;

public class Calculator {
	/**Calculate expression */ 
	public Double Calculate(double x, double y)
	{
		try{
			Double result;
			result = 1 + Math.sin(x+y)*Math.sin(x+y);		
			result /= 2 + Math.abs(x - 2*x/1+x*x*y*y);
			result += x;
			return result;
		}
		catch (ArithmeticException e){
			System.out.println("Divide by zero exception.");
			return null;
		}		
	}

}
