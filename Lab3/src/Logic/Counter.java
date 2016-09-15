package Logic;

public class Counter {
	/**Count tangent on [a, b] with step h*/
	public double[] CountFunction(double a,double b,double h)
	{
		if (((a <= b)&&(h>=0))||((a >= b)&&(h<=0)))
		{
			int length = 1;
			if (h!=0)
				length = (int)((b - a) / h) + 11;			
			double[] tableResult = new double[length];
			
			for (int i = 0; i< length; i++)
				tableResult[i]=Math.tan(a+i*h);
			
			return tableResult;
		}		
		return null;
	}

}
