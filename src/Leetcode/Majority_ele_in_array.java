package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Majority_ele_in_array {

	public static void main(String[] args) {

    int b [] = {22,22,12,12,12,22,22};
    
    int n = b.length;
    int count=0;
    int max=0;
    int value=0;
    
   HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
   
   for(int i=0;i<b.length;i++)
   {
	   if(!hm.containsKey(b[i]))
	   {
		   hm.put(b[i], 1);
	   }
	   
	   else
	   {
		   hm.put(b[i], hm.get(b[i])+1);
	   }
   }
    
   for(Map.Entry<Integer, Integer> entry : hm.entrySet())
   {
	   if(entry.getValue()>max)
	   {
		   max=entry.getValue();
		   value =entry.getKey();
	   }
	   
	   
	  
   }
   System.out.println(max);
   System.out.println(value);
	}

}
