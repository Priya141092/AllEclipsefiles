package Hard_Array_Problems;

import java.util.Arrays;

public class find_repeating_missing_number {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,3,4,5};
		//0,1,2,3,4,5
		int n = a.length;
		
		
		
		int repeating=0, missing=0;
		int count =0;
		
		int orgsum=0;
		int cursum=0;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					repeating=a[j];
				}
			}
			orgsum = orgsum+(i+1);
			cursum=cursum+a[i];
			
			
		}
		
		
		missing = orgsum -(cursum -repeating);
		System.out.println(repeating);
		System.out.println(missing);
		
		
	}

}
