package CodingDayWise;

import java.util.HashMap;

public class Longest_substring_non_repeat_hashmap {

	public static void main(String[] args) {
		
		String s ="abcdebbadzrtyuiop";
		
		int st=0;
		int maxlen=0;
		int curlen=0;
		
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(!hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i),i);
			}
			
			else
			{
				if(hm.get(s.charAt(i))>=st)
				{
					curlen=i-st;
					maxlen=curlen;
				}
				System.out.println(maxlen);
				
			}
		}

	}

}
