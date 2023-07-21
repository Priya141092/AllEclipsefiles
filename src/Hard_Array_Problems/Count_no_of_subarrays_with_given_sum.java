package Hard_Array_Problems;

public class Count_no_of_subarrays_with_given_sum {

	public static void main(String[] args) {
		int arr[] = { 10, 2, -2, -20, 10 };
		int sum = -10;
		int res=0;
		
		
		
		for(int i=0;i<arr.length;i++)
		{int max =0;
			for(int j=i;j<arr.length;j++)
			max = max+arr[j];
			
			if(max==sum)
			{
				res++;
			}
		}
	
		System.out.println(res);

	}

}
