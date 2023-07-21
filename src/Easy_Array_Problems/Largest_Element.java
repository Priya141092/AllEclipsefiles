package Easy_Array_Problems;

public class Largest_Element {

	public static void main(String[] args) {

      int a[] = {1,5,3,2,6};
      
      int max = a[0];
      
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]>max)
    	  {
    		  max = a[i];
    	  }
      }
      System.out.println(max);
   
		

	}

}
