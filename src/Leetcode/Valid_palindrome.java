package Leetcode;

public class Valid_palindrome {

	public static void main(String[] args) {

      String s = "abcda";
      int i=0;
      int j = s.length()-1;
      
      while(i<j)
      {
    	  Character start = s.charAt(i);
    	  Character end = s.charAt(j);
    	  
    	  if(!Character.isLetterOrDigit(i))
    	  {
    		 i++;
    		 continue;
    	  }
    	  if(!Character.isLetterOrDigit(j))
    	  {
    		j--;
    		continue;
    	  }
          if(Character.toLowerCase(i)!=Character.toLowerCase(j)){
        	 System.out.println("false");
              
          }
          i++;
          j--; 
          
      }
      
      System.out.println("true");

	}

}
