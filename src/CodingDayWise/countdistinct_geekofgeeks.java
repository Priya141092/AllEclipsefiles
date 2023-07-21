package CodingDayWise;

import java.util.HashMap;

public class countdistinct_geekofgeeks {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 4, 2, 3 };
        int K = 4;
 
        // Function call
        countDistinct(a, K);

	}

	public static void countDistinct(int[] a, int k) {
		int count=0;

     HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
     
     for(int i=0;i<k;i++)
     {
    	 hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
     }
     
     System.out.println(hm.size());
     
     for (int i = k; i < a.length; i++) {
    	 
         // Remove first element of previous window
         // If there was only one occurrence
         if (hm.get(a[i - k]) == 1) {
             hm.remove(a[i - k]);
         }

         else // reduce count of the removed element
             hm.put(a[i - k], hm.get(a[i - k]) - 1);

         // Add new element of current window
         // If this element appears first time,
         // set its count as 1,
         hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);

         // Print count of current window
         System.out.println(hm.size());
		
	}
	}
}
