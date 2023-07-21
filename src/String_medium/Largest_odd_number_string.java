package String_medium;

public class Largest_odd_number_string {

	public static void main(String[] args) {
		
		String  s= "9675";
		
		int m  = Integer.parseInt(s);
		
		String h []= s.split(" ");
		char max =' ';
		char largemax=' ';
		
		
	
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)%2)!=0)
			{
				 max = s.charAt(i);//9
				
				//largemax = max;//9
				
				if(max>=largemax)
				{
					largemax=max;
				}
				
				
			}
		}
		System.out.println(largemax);
	
	
	}
	
		

	}


