package Easy_Array_Problems;

public class Second_largest_Array {

	public static void main(String[] args) {

    int b[] = {1,4,5,6,2,3};
    
//    int largest = Integer.MIN_VALUE;
//    int sec_largest = Integer.MIN_VALUE;
    
    int largest = b[0];
    int sec_largest = b[0];
    
    for(int i=0;i<b.length;i++)
    {
    	if(b[i]>largest)
    	{  
    		sec_largest=largest;
    		largest=b[i];
    		
    		
    	}
    	if(b[i]<largest && sec_largest<b[i])
    	{
    		sec_largest=b[i];
    	}
    	
    	 
    	
    }
    
         System.out.println(sec_largest);

	}

}
