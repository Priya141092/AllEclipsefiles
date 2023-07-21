package CodingDayWise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;

public class Longest_substr_without_repeating_characters {

	public static void main(String[] args) {
		String s = "abcabbc";
		int a_pointer=0;
		int b_pointer=0;
		int max =0;
		
		HashSet<Character> st = new HashSet<Character>();
		
		while(b_pointer<s.length())
		{
			if(!st.contains(s.charAt(b_pointer)))
			{
				st.add(s.charAt(b_pointer));
				b_pointer++;
				max= Math.max(st.size(),b_pointer);
				
			}
			else
			{
				st.remove(s.charAt(a_pointer));
				a_pointer++;	
			}
			
		}
		System.out.println(max);
		
	}
	
}
