package String_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_every_word_string {

	public static void main(String[] args) {


		String d = "My name is pria saxena";
		
		StringBuffer s = new StringBuffer(d);
		d = s.reverse().toString();
		
		String h [] = d.split(" ");
		
		
		
		
		for(int i=h.length-1;i>0;i--)
		{
			System.out.println(h[i].toString());
		}
			
		
//		List<String> li = new ArrayList<String>(Arrays.asList(d));
//		
//		for(int i=0;i<li.size();i++)
//		{
//			StringBuilder s = new StringBuilder();	
//			
//		}
		
		
		
	
		
		
		

	}

}
