package Hard_Array_Problems;

public class Length_of_longest_subarray_with_0_sum {

	public static void main(String[] args) {
		
		int a[] ={1, 2, -2, 4, -4};
		int max =0;
		
		
		for(int i=0;i<a.length;i++)
		{
			int sum =0;
		for(int j=i;j<a.length;j++)
		{
			sum=sum+a[j];
			if(sum==0)
			{
				//max = Math.max(max, j);
				max=j;
				
				
			}
			
		}
		
		
		}
		System.out.println(max);
		
	}

}
