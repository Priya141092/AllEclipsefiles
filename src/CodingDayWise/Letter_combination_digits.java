package CodingDayWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_combination_digits {
	
	public List<String> lettercombinations(String digits)
	{
		ArrayList<String> ans = new ArrayList<String>();
		if(digits.length()==0)
		return ans;
		
		HashMap<Character,String> hm = new HashMap<Character,String>();
		hm.put('2', "abc");
		hm.put('3', "def");
		hm.put('4', "ghi");
		hm.put('5', "jkl");
		hm.put('6', "mno");
		hm.put('7', "pqrs");
		hm.put('8', "tuv");
		hm.put('9', "wxyz");
		
		
		backtrack(digits,0,hm,new StringBuilder(),ans);
		return ans;
		
	}

	public void backtrack(String digits, int i, HashMap<Character, String> hm, StringBuilder sb,
			ArrayList<String> ans) {
		if(i==digits.length())
		{
			//1==1
			//a
			ans.add(sb.toString());
			return;
		}
		//abc                  //0
		//def                   //1
		String curr = hm.get(digits.charAt(i));
		for(int k=0;k<curr.length();k++)
       {
			sb.append(curr.charAt(k));//a, //d
			backtrack(digits,i+1,hm,sb,ans);
			sb.deleteCharAt(sb.length()-1);	
			
	  }
		
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
