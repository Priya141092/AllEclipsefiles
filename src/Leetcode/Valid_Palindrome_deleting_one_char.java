package Leetcode;

public class Valid_Palindrome_deleting_one_char {

	public static void main(String[] args) {
		
		String s ="abca";
		boolean value =validPalindrome(s);
		System.out.println(value);
		

	}

	public static  boolean validPalindrome(String s)
	{
		int left=0;
		int right = s.length()-1;
		while(left<=right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return ispalidrom(s,left+1,right)||ispalidrom(s,left,right-1);
				
			}
			left++;
			right--;
		}
		return true;
		
	}
	
	public static boolean ispalidrom(String s, int start, int end)
	{
		
		while(start<=end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		 return true;	
		
	}
}
