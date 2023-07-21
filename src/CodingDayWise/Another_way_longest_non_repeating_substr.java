package CodingDayWise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Another_way_longest_non_repeating_substr {

	public static void main(String[] args) {

       String s = "abcdebbadzrtyuiop";
       
       int max =0;
       int h=0;
       
       int j=0;
       
       
       LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
       
       for(int i=0;i<s.length();i++)
       {
    	   
    	   if(!hs.contains(s.charAt(i)))
    	   {
    	    hs.add(s.charAt(i));
    	    max = Math.max(hs.size(), i);
         }
    	 else 
    	    {
    		 break;
    		}
    	   }
         System.out.println(max);

	}

}
