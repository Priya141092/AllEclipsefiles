package Hard_Array_Problems;

public class Merge_two_sorted_arrays {
	
	public static void swap(int i, int j,int a[],int b[])
	{
		int temp = a[i];
		a[i]=b[j];
		b[j]=temp;
	}

	public static void main(String[] args) {
		
		
		int a[] = {2,4,5};
		int b[] = {3,6,7};
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]>b[j])
				{
					swap(i,j,a,b);
				}
				
				else
				{
					break;
				}
				
			}
			
			
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		for(int l=0;l<a.length;l++)
		{
			System.out.println(b[l]);
		}
		
		
		
//		int n= a.length;
//		int m = 0;
//		
//		int i = n-1;
//		int j=m;
		
		
		
		
		
		
		
		

	}

}
