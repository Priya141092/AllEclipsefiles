package Medium_Array_Problems;

public class Majority_Ele_nhalf2 {

	public static void main(String[] args) {
		
		int a[]  = {2,2,1,3,4,2,2};
		int msize = ((a.length)/2);
		
		
		
		for(int i=0;i<a.length;i++)
		{int count =0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					count++;
				}
			}
			
			if(count>=msize)
			{
				System.out.println(a[i]);
			}

		}
		
		
	}

}
