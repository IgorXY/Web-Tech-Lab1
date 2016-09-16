package Logic;

public class ShellSorter {
	public void Sort(double[] array){
		if (array != null){
		int i = 0;
		double temp;
		while(i<array.length-1){
			if(array[i]<=array[i+1])
				i++;
			else{
				temp = array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
				if(i>0)
					i--;
			}
		}
		}
	}

}
