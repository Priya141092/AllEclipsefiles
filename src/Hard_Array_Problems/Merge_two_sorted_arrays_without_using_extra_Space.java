package Hard_Array_Problems;

public class Merge_two_sorted_arrays_without_using_extra_Space {
	
	public static void swap(int a[], int b[], int i, int j)
	{
		int temp = a[i];
		a[i]=b[j];
		b[j]=temp;
	}

	public static void main(String[] args) {

         
		int a[] = {2,4,5};
		int b[] = {3,6,7};
		int i=0;
		int j=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]>b[j])
			{
				swap(a,b,i,j);
			}
			
			else
			{
				break;
			}
			
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
			System.out.println(b[k]);
			
		}
		

	}

}
