package Easy_Array_Problems;

public class Check_if_the_array_is_sorted {
	
	
	static boolean isSorted(int a[])
	{

		
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]>a[i]) 
			{
				return false;
			}
			
		}
		
        return true;
	}
	

	public static void main(String[] args) {
		int a[] = {4,2,1,7,5};
		boolean value =isSorted(a);
		System.out.println(value);
	}

}
