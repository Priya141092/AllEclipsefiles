package Hard_Array_Problems;

import java.util.HashMap;

public class find_the_repeating_missing_number {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 2};
		
		
		int mis_numb;
		int repeatno;
		
		int sum=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
			}
			
			else
			{
				hm.put(a[i], 1);
			}
			
			
			
		}
		
		
		
		
		

	}

}
