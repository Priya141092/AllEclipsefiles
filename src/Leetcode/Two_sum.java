package Leetcode;

public class Two_sum {

	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target=9;
		
		twoSum(nums,target);
		

	}
	
     public static int[] twoSum(int[] nums, int target) {
    	 int count=0;
    	 
    	 for(int i=0;i<nums.length;i++)
    	 {
    		 for(int j=i+1;j<nums.length;j++)
    		 {
    			 if((nums[i]+nums[j])==target)
    			 {
    				 System.out.print(i);
    				 System.out.print(j);
    				
    			 }
    		 }
    	 }
		return nums;
    	 
    	 
		
         
        
    }

}
