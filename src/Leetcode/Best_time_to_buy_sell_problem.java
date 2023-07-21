package Leetcode;

public class Best_time_to_buy_sell_problem {

	public static void main(String[] args) {
		
		int a[] = {7,1,5,3,6,4};
		
		int min = Integer.MAX_VALUE;
		//The point is if you want to keep updating the minimum value, you have to start from the biggest possible number and make comparisons that way.
		//Likewise, if you want to keep updating the maximum value, you have to start from the smallest possible number.


		int max_prof =0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
			else if((a[i]-min) > max_prof)
			{
				max_prof= a[i]-min;
			}
			
			
		}
		
		System.out.println(max_prof);
	}

}
