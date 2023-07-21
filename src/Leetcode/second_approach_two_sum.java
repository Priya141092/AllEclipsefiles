package Leetcode;

import java.util.HashMap;

public class second_approach_two_sum {

	public static void main(String[] args) {
		
		int [] nums = {2,7,11,15};
		int target=9;
		
		
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<hm.size();i++)
		{
			hm.put(i, nums[i]);
				
		
		
		while(hm.size()!=0)
		{
		 if((hm.get(i)+hm.get(i+1))==target)
		 {
			 System.out.println(hm.get(i));
			 }
		 }
		
		}
	}

}
