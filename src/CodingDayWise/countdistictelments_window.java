package CodingDayWise;

import java.util.HashMap;

public class countdistictelments_window {

	public static void main(String[] args) {
		 int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
	        int K = 4;
	 
	        // Function call
	        countDistinct(arr, K);

	}

	public static void countDistinct(int[] arr, int k) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int count=0;
		

     for(int i=0;i<k;i++)
     {
    	 if(hm.get(arr[i])==null)
    	 {
    		 hm.put(arr[i], 1);
    		 count++;	 
    	 }
    	 
    	 else
    	 {
    		 hm.put(arr[i], count+1);
    	 }
    
     
    	 
    	 for(i=k;i<arr.length;i++)
    	 {
    		 if(hm.get(arr[i-k])==1)
    		 {
    			 hm.remove(arr[i-k]);
    			 count--;
    		 }
    		 
    		 else
    		 {
    			 hm.put(arr[i-k], count-1);
    		 }
    		 
    		 if(hm.get(arr[i-k])==null)
    		 {
    			 hm.put(arr[i-k], 1);
    			 count++;
    		 }
    		 
    		 else
    		 {
    			 hm.put(arr[i], count+1);
    		 }
    	 }
    	 System.out.println(count);
    	 
     }
		
	

}
}
