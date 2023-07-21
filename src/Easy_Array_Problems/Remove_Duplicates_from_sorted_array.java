package Easy_Array_Problems;

public class Remove_Duplicates_from_sorted_array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,3,1};
		int[] m = new int [a.length];
		int j=0;
		
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				m[j]=a[i];
				j++;
			}
				
			
			}
			
		for(int k=0;k<m.length;k++)
		{
			System.out.println(m[k]);
		}
		}

	}


