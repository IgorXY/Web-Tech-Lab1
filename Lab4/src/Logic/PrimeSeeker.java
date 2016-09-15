package Logic;

import java.util.ArrayList;

public class PrimeSeeker {
	/**Check is integer value prime*/
	boolean IsPrime(int x){
		if(x>1){
		for (int i = 2; i<=Math.sqrt(x); i++)
			if ((x % i) == 0)
				return false;
		return true;
		}
		return false;
	}
	/**Seek all primes in array and returns indexes*/
	public ArrayList<Integer> SeekPrime(int[] array)	{
		ArrayList<Integer> indexArray = new ArrayList<Integer>();
		if(array != null)
			for(int i = 0; i< array.length; i++)
				if(IsPrime(array[i]))
					indexArray.add(i);
		return indexArray;
	}

}
