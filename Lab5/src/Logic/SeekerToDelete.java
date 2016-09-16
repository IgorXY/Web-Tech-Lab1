package Logic;

public class SeekerToDelete {
	int max = 0;
	/**Find max rising continuity*/
	void FindMax(int[] array, int i, int last, int cur_max)
	{
		if(i == array.length-1){
			if (max < cur_max)
				max = cur_max;
		}
		else
		{
			if(last<array[i+1])
				FindMax(array, i+1, array[i+1], cur_max+1);
			FindMax(array, i+1, last, cur_max);
			FindMax(array, i+1, array[i+1], 1);
		}
		
	}
	/**Find min count to delete*/
	public Integer FindCountToDrop(int[] array)
	{
		if(array != null)
		{
			FindMax(array, 0, array[0], 1);
			return array.length - max;
		}
		return null;
	}

}
