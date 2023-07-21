package Leetcode;

public class Move_all_zeroes_end {

	public static void main(String[] args) {
		
		int a[] = {1,0,2,3,0,6,0};
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
				
		while(count<a.length)
		{
			a[count++]=0;
		}
		
     for(int k=0;k<a.length;k++)
     {
    	 System.out.println(a[k]);
     }
     
	}

}
