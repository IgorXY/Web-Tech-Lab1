package Logic;

public class Mixer {
	public int[] MixArray(double[] a, double[] b){
		if((a!=null)&&(b!=null)){
			int i=0, j=0;
			int[] indexes = new int[b.length];
			while((j<b.length)&&(i<a.length)){
				if(b[j]<a[i]){
					indexes[j]=i+1;
					j++;
				}
				else
					i++;
			}
			while(j<b.length){
				indexes[j]=a.length+1;
				j++;
			}
			return indexes;
		}
		else
			return null;
	}
}
