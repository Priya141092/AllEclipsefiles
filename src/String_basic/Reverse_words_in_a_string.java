package String_basic;

public class Reverse_words_in_a_string {

	public static void main(String[] args) {
		String s = "My name is Priya";
		
		String k[] = s.split(" ");
		
		for(int i=k.length-1;i>=0;i--)
		{
			System.out.println(k[i]);
		}
		

	}

}
