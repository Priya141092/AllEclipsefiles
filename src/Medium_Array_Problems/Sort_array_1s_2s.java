package Medium_Array_Problems;

public class Sort_array_1s_2s {
	
	public static void main(String args[])
	{
		int a[] = {1,0,2,0,1,0};
		int count_0=0;
		int count_1 =0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count_0++;
				
			}
			
			if (a[i]==1)
			{
				count_1++;
			}
			
			 
		}
		for(int j=0;j<count_0;j++)
		 {
			 a[j]=0;
			  
		 }
		for(int j=count_0;j<(count_0+count_1);j++)
		{
			a[j]=1;
			
		}
		for(int j=(count_0+count_1);j<a.length;j++)
		{
			a[j]=2;
		}
		 
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	

}
