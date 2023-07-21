package CodingDayWise;

public class Largest_sum_array_contigous {

	public static void main(String[] args) {
		int a[] = {-5,6,-7,1,4,-8};
		
		int sum=0;
		int intersum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
			if(sum>intersum)
			{
				intersum=sum;
				
			}
			
		}
		System.out.println(intersum);
	}

}
