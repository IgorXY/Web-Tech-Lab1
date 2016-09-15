package Logic;

public class SeekerToDelete {
	int max = 0;
	/**Find max rising continuity*/
	void FindMax(int[] array, int i, int cur_max)
	{
		if(i == array.length-1){
			if (max < cur_max)
				max = cur_max;
		}
		else
		{
			if(array[i]<array[i+1])
				FindMax(array, i+1, cur_max+1);
			FindMax(array, i+1, cur_max);
		}
		
	}
	/**Find min count to delete*/
	public Integer FindCountToDrop(int[] array)
	{
		if(array != null)
		{
			FindMax(array, 0, 1);
			return array.length - max;
		}
		return null;
	}

}
