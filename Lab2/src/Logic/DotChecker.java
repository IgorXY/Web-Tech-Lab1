package Logic;

public class DotChecker {
	/**Check if dot is in field*/
	public boolean CheckDot(double x, double y)
	{
		if (y>0)
		{
			if ((y<=5)&&(x>=-4)&&(x<=4))
				return true;
		}
		else
			if ((y>=-3)&&(x>=-6)&&(x<=6))
				return true;
		return false;
	}

}
